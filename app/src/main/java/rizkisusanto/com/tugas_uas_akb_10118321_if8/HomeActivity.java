// 10 Agustus 2021 - 10118321 - Muhammad Rizki Susanto - IF 8
package rizkisusanto.com.tugas_uas_akb_10118321_if8;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.R;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.profile.ProfileFragment;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.wisata.WisataFragment1;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.wisata.WisataFragment2;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.wisata.WisataFragment3;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.wisata.WisataFragment4;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        getSupportActionBar().hide();

        getFragmentPage(new ProfileFragment());

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment fragment = null;

                switch (item.getItemId()){
                    case
                            R.id.kota_bandung:
                        fragment = new WisataFragment1();
                        break;
                    case
                            R.id.kabupaten_bandung:
                        fragment = new WisataFragment2();
                        break;
                    case
                            R.id.profile:
                        fragment = new ProfileFragment();
                        break;
                    case
                            R.id.kabupaten_bandung_barat:
                        fragment = new WisataFragment3();
                        break;
                    case
                            R.id.kota_cimahi:
                        fragment = new WisataFragment4();
                        break;
                }
                return getFragmentPage(fragment);
            }
        });
        bottomNavigationView.setSelectedItemId(R.id.profile);
    }

    private boolean getFragmentPage(Fragment fragment){
        if (fragment != null){
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.page_container_home, fragment)
                    .commit();
            return true;
        }
        return false;
    }
}