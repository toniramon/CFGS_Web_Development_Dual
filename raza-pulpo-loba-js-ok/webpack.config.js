const TerserPlugin = require('terser-webpack-plugin');
const path = require('path');
const HtmlWebpackPlugin = require('html-webpack-plugin');
const UglifyJsPlugin = require('uglifyjs-webpack-plugin');

module.exports = {
    entry: ['babel-polyfill', './assets/js/main.js'],
    output: {
        path: path.resolve(__dirname, './dist/'),
        filename: "bundle.js"
    },
    devServer: {
        contentBase: './js'
    },
    plugins: [
        new HtmlWebpackPlugin({
            filename: 'index.html',
            template: 'index.html'
        })
    ],
    optimization: {
      minimize: true,
      minimizer: [new TerserPlugin()],
    },
    module: {
        rules: [
            {
                test: /\.js$/,
                exclude: /node_modules/,
                use: {
                    loader: 'babel-loader'
                }
            }
        ]
    }
}