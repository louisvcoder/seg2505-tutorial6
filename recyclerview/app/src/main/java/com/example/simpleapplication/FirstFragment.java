package com.example.simpleapplication;

// RecyclerView exercise developed with AI tutoring and scaffold assistance.
// Reference: https://developer.android.com/develop/ui/views/layout/recyclerview

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.simpleapplication.databinding.FragmentFirstBinding;
import androidx.recyclerview.widget.LinearLayoutManager;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding.recyclerView.setLayoutManager(
                new LinearLayoutManager(requireContext())
        );
        String[] items = new String[40];

        for (int i = 0; i < items.length; i++) {
            items[i] = "Person " + (i + 1);
        }
        binding.recyclerView.setAdapter(new ItemsAdapter(items));
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}