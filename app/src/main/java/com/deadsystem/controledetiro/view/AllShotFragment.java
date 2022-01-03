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

import com.deadsystem.controledetiro.databinding.FragmentShotBinding;
import com.deadsystem.controledetiro.viewmodel.AllShotViewModel;

public class AllShotFragment extends Fragment {

    private AllShotViewModel allShotViewModel;
    private FragmentShotBinding binding;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        allShotViewModel =
                new ViewModelProvider(this).get(AllShotViewModel.class);

        binding = FragmentShotBinding.inflate(inflater, container, false);
        View root = binding.getRoot();

        final TextView textView = binding.textHome;
        allShotViewModel.getText().observe(getViewLifecycleOwner(), new Observer<String>() {
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