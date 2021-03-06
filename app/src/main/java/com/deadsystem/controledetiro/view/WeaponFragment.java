package com.deadsystem.controledetiro.view;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.deadsystem.controledetiro.databinding.FragmentWeaponBinding;
import com.deadsystem.controledetiro.viewmodel.WeaponViewModel;

public class WeaponFragment extends Fragment {

    private WeaponViewModel weaponViewModel;
    private FragmentWeaponBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        weaponViewModel = new ViewModelProvider(this).get(WeaponViewModel.class);

        binding = FragmentWeaponBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textGallery;
        weaponViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
            @Override
            public void onChanged(@Nullable String s) {
                textView.setText(s);
            }
        });
        return root;
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }
}