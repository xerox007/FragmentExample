package com.example.dell.fragmentexample;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Dell on 11/27/2016.
 */
public class RegisterFragment extends Fragment {

    private EditText etUsername;
    private EditText etAddress;
    private EditText etRegisterEmail;
    private EditText etRegisterPassword;
    private Button btnRegister;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_register,container,false);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        etUsername = (EditText) view.findViewById(R.id.etName);
        etAddress  = (EditText) view.findViewById(R.id.etAddress);
        etRegisterEmail = (EditText) view.findViewById(R.id.etRegisterEmail);
        etRegisterPassword = (EditText) view.findViewById(R.id.etRegisterPassword);

        super.onViewCreated(view, savedInstanceState);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
    }
}
