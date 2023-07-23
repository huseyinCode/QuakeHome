package com.example.earthquakehome;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

/**

 */
public class BedroomFragment extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        super.onCreate(savedInstanceState);
        View v = inflater.inflate(R.layout.fragment_bedroom,container, false);
        Button backbut = (Button) v.findViewById(R.id.Back);
        backbut.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Fragment fragment = getParentFragmentManager().findFragmentByTag("Fragment_Bedroom");
                if(fragment != null){
                    getParentFragmentManager().beginTransaction().remove(fragment).commit();
                getParentFragmentManager().popBackStack();}
            }
        });
//TODO:draw bedroom devices and add to code
        return v;
    }
}


