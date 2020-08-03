<?php

use Illuminate\Database\Seeder;
use App\Diario;

class DiarioSeeder extends Seeder
{
    /**
     * Run the database seeds.
     *
     * @return void
     */
    public function run()
    {
        DB::table('diario')->delete();
        $json = File::get("storage/database/diarioMariano.json");
        $data = json_decode($json);
        foreach ($data as $obj) {
            Diario::create([
                'eventos' => $obj->eventos,
                'pulpo' => $obj->pulpo,
            ]);
        }
    }
}
