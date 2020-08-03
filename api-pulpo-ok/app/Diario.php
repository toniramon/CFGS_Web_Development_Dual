<?php

namespace App;

use Illuminate\Database\Eloquent\Model;

class Diario extends Model
{
    protected $table = 'diario';
    protected $fillable = ['eventos', 'pulpo'];

    protected $casts = [
        'eventos' => 'array',
    ];
}
