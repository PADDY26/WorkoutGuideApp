package com.my.workoutguide.ui.home;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import com.my.workoutguide.ui.ABSA;
import com.my.workoutguide.ui.ARMA;
import com.my.workoutguide.ui.ARMB;
import com.my.workoutguide.ui.BASA;
import com.my.workoutguide.ui.BASB;
import com.my.workoutguide.ui.CHESTA;
import com.my.workoutguide.ui.ChestB;
import com.my.workoutguide.ui.LEGA;
import com.my.workoutguide.ui.LEGB;
import com.my.workoutguide.R;
import com.my.workoutguide.ui.ABSB;
import com.my.workoutguide.ui.ABSI;
import com.my.workoutguide.ui.ARMI;
import com.my.workoutguide.ui.BASI;
import com.my.workoutguide.ui.CHESTI;
import com.my.workoutguide.ui.LEGI;

public class HomeFragment extends Fragment {
Button b1;
Button b2;
Button b3;
Button b4;
Button b5;
Button b6;
Button b7;
Button b8;
Button b9;
Button b10;
Button b11;
Button b12;
Button b13;
Button b14;
Button b15;



    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        View v= inflater.inflate(R.layout.fragment_home, container, false);
        b1=v.findViewById(R.id.button1);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), ABSB.class));
            }
        });

        b2=v.findViewById(R.id.button2);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ChestB.class));

            }
        });

        b3=v.findViewById(R.id.button3);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ARMB.class));

            }
        });

        b4=v.findViewById(R.id.button4);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), LEGB.class));

            }
        });

        b5=v.findViewById(R.id.button5);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), BASB.class));

            }
        });
        b6=v.findViewById(R.id.button6);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ABSI.class));

            }
        });
        b7=v.findViewById(R.id.button7);
        b7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), CHESTI.class));

            }
        });
        b8=v.findViewById(R.id.button8);
        b8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ARMI.class));

            }
        });
        b9=v.findViewById(R.id.button9);
        b9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), LEGI.class));

            }
        });
        b10=v.findViewById(R.id.button10);
        b10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), BASI.class));

            }
        });
        b11=v.findViewById(R.id.button11);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ABSA.class));

            }
        });
        b12=v.findViewById(R.id.button12);
        b12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), CHESTA.class));

            }
        });
        b13=v.findViewById(R.id.button13);
        b13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), ARMA.class));

            }
        });
        b14=v.findViewById(R.id.button14);
        b14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), LEGA.class));

            }
        });
        b15=v.findViewById(R.id.button15);
        b15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {startActivity(new Intent(getActivity(), BASA.class));

            }
        });


       return v;
    }
}