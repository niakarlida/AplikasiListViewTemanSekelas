package id.ac.poliban.mi.nia.aplikasilistviewtemansekelas;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private List<String> nama = new ArrayList<>();
    {
        nama.add("Eko Asdy Wibowo Saputra");
        nama.add("Fenia Dwi Maulida");
        nama.add("Firda Kharisma");
        nama.add("Hendra Gunawan");
        nama.add("Himi Amaliah");
        nama.add("Insan Norcahyo");
        nama.add("Maisarah");
        nama.add("Maulida Rahmi");
        nama.add("Mayadiah Atikasari");
        nama.add("Molida Junida");
        nama.add("Muhammad Auzan");
        nama.add("Muhammad Hafizh Anshari");
        nama.add("Muhammad Rizki Fahmi");
        nama.add("Nia Karlida Yanti");
        nama.add("Nur Rizki Aulia");
        nama.add("Octa Pasaribu");
        nama.add("Sari Rahma Maulida");
        nama.add("Wardatul Hisaniah");
        nama.add("Wenny Lisandra");
        nama.add("Ahmad Yusfan Hafizh");
        nama.add("Sri Wahyuni");
        nama.add("Haifa Mai Suci");
        nama.add("Muhammad Rasyad Sultansyah");
        nama.add("Hendri Pratama");
        nama.add("Risma Sari");
        nama.add("M Tri Utomo");
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if(getSupportActionBar()!=null)
            setTitle("Aplikasi List Teman Sekelas");

        ListView listView = findViewById(R.id.lvTemanKelas);

        ArrayAdapter adapter = new ArrayAdapter(this,
                R.layout.item_rows_teman_kelas, R.id.tvNamaTeman, nama);

        listView.setAdapter(adapter);

        listView.setOnItemClickListener((parent, view, position, id) ->{
            Toast.makeText(this, "Ini " + nama.get(position), Toast.LENGTH_SHORT).show();
        });
    }
}
