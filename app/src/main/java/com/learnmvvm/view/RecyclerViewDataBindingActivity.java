package com.learnmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import com.learnmvvm.R;
import com.learnmvvm.databinding.ActivityRecyclerViewDataBindingBinding;

public class RecyclerViewDataBindingActivity extends AppCompatActivity {
    ActivityRecyclerViewDataBindingBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
       // setContentView(R.layout.activity_recycler_view_data_binding);
        binding = DataBindingUtil.setContentView(this , R.layout.activity_recycler_view_data_binding);
    }
}