const { src, dest, series } = require('gulp');

const uglify = require('gulp-uglify');
const rename = require('gulp-rename');

const browserify = require('browserify');
var source = require('vinyl-source-stream');
const buffer = require('vinyl-buffer');

function simpleDeploy() {
    return src('src/hello_require.js')
     .pipe(dest('bundle/'));
}

function uglyDeploy() {
    return src('src/hello_require.js')
     .pipe(uglify())
     .pipe(rename({ extname: '.min.js' }))
     .pipe(dest('bundle/'));
}

function browserDeploy() {
    var b = browserify();
    b.add('./src/hello_require.js');
    return  b.bundle()
      // bundle genera un stream
      // source de vinyl-sourece-stream genera
      // Creates a through stream which takes text as input,
      // and emits a single vinyl file instance for streams
      // down the pipeline to consume.
     .pipe(source('bundle.js'))
     .pipe(buffer())
     .pipe(uglify())
     .pipe(rename({ extname: '.min.js' }))
     .pipe(dest('src/'));
}

var build = series(simpleDeploy, browserDeploy);

exports.default = build;