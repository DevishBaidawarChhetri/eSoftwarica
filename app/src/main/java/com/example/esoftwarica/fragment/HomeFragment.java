package com.example.esoftwarica.fragment;


import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioGroup;
import android.widget.Toast;

import com.example.esoftwarica.DashboardActivity;
import com.example.esoftwarica.R;
import com.example.esoftwarica.adapter.StudentsAdapter;

/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

   RecyclerView recyclerView;

    public HomeFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);
        recyclerView = view.findViewById(R.id.recyclerView);
        if (DashboardActivity.studentsList.isEmpty()) {
            Toast.makeText(getContext(),"empty" , Toast.LENGTH_SHORT).show();
        }
        else {
            StudentsAdapter studentsAdapter = new StudentsAdapter(getContext(), DashboardActivity.studentsList);
            recyclerView.setAdapter(studentsAdapter);
            recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        }
        return view;
    }
}
