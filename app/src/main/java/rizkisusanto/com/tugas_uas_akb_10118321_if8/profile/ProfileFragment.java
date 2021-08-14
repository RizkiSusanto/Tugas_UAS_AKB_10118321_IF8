// 11 Agustus 2021 - 10118321 - Muhammad Rizki Susanto - IF 8
package rizkisusanto.com.tugas_uas_akb_10118321_if8.profile;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import com.bumptech.glide.Glide;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.R;

public class ProfileFragment extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container
            ,Bundle savedInstanceState) {
        ViewGroup rootView = (ViewGroup) inflater.inflate(R.layout.fragment_profile, container, false);

        ImageView ivProfileFoto = rootView.findViewById(R.id.ivFotoProfile);
        Glide.with(this)
                .load(R.drawable.profile)
                .into(ivProfileFoto);
        return rootView;
    }
}