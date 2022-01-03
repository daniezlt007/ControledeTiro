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

import com.deadsystem.controledetiro.databinding.FragmentShootingClubBinding;
import com.deadsystem.controledetiro.viewmodel.ShootingClubViewModel;

public class ShootingClubFragment extends Fragment {

    private ShootingClubViewModel shootingClubViewModel;
    private FragmentShootingClubBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        shootingClubViewModel =
                new ViewModelProvider(this).get(ShootingClubViewModel.class);

        binding = FragmentShootingClubBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textSlideshow;
        shootingClubViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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