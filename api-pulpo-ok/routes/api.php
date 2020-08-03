<?php

use Illuminate\Http\Request;

/*
|--------------------------------------------------------------------------
| API Routes
|--------------------------------------------------------------------------
|
| Here is where you can register API routes for your application. These
| routes are loaded by the RouteServiceProvider within a group which
| is assigned the "api" middleware group. Enjoy building your API!
|
*/

Route::middleware('auth:api')->get('/user', function (Request $request) {
    return $request->user();
});

// Route::resource('diario', ['middleware' => 'cors'], 'DiarioController');

//Agregamos nuestra ruta al controller de Diario
Route::middleware('cors')->resource('diario', 'DiarioController');
// Route::resource('diario', array('middleware' => 'cors', 'uses' => 'DiarioController'));