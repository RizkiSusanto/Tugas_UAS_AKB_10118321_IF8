package rizkisusanto.com.tugas_uas_akb_10118321_if8.info;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.PagerAdapter;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import rizkisusanto.com.tugas_uas_akb_10118321_if8.MainActivity;
import rizkisusanto.com.tugas_uas_akb_10118321_if8.R;

import java.util.ArrayList;
import java.util.List;

public class InfoFragment extends Fragment {
    // 12 Agustus 2021 - 10118321 - Muhammad Rizki Susanto - IF 8
    private ViewPager viewPager;
    private PagerAdapter pagerAdapter;
    private MainActivity mainActivity;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_info, container, false);

        viewPager = root.findViewById(R.id.view_pager_info);
        return root;
    }

    @Override
    public void onViewCreated(View view,Bundle savedInstanceState) {
        mainActivity = (MainActivity) getActivity();

        List<Fragment> list = new ArrayList<>();
        list.add(new InfoFragmentSlide1());
        list.add(new InfoFragmentSlide2());
        list.add(new InfoFragmentSlide3());

        pagerAdapter = new InfoFragmentSlideAdapter(requireActivity().getSupportFragmentManager(), list);

        viewPager.setAdapter(pagerAdapter);
    }
}