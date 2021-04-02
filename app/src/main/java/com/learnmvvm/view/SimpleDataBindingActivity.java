package com.learnmvvm.view;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;
import android.widget.Toast;

import com.learnmvvm.R;
import com.learnmvvm.databinding.ActivityBindingDataSimpleBinding;
import com.learnmvvm.model.Users;

public class SimpleDataBindingActivity extends AppCompatActivity {
    ActivityBindingDataSimpleBinding binding;
    Users users = new Users();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //setContentView(R.layout.activity_binding_data_simple);
        binding= DataBindingUtil.setContentView(this , R.layout.activity_binding_data_simple);
        users.setName("REZA KARIMNIA");
        users.setEmail("RezaKarimnia70@yahoo.com");
        binding.setUsers(users);
    }
}