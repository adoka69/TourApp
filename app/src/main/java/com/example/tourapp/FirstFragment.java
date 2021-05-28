package com.example.tourapp;

import android.opengl.Visibility;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class FirstFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_first, container, false);

        Button button = view.findViewById(R.id.show_info);
        LinearLayout expandableveiw = view.findViewById(R.id.expandable_view);
        CardView cardView = view.findViewById(R.id.cardview_expandable);
        Button button1_2 = view.findViewById(R.id.show_info1_2);
        LinearLayout expandableveiw1_2 = view.findViewById(R.id.expandable_view1_2);
        CardView cardView1_2 = view.findViewById(R.id.cardview_expandable1_2);
        Button button1_3 = view.findViewById(R.id.show_info1_3);
        LinearLayout expandableveiw1_3 = view.findViewById(R.id.expandable_view1_3);
        CardView cardView1_3 = view.findViewById(R.id.cardview_expandable1_3);

        button.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                    if(expandableveiw.getVisibility()==View.GONE){
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableveiw.setVisibility(View.VISIBLE);
                    }
                    else {
                        TransitionManager.beginDelayedTransition(cardView, new AutoTransition());
                        expandableveiw.setVisibility(View.GONE);
                    }
                }
        });
        button1_2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(expandableveiw1_2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1_2, new AutoTransition());
                    expandableveiw1_2.setVisibility(View.VISIBLE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView1_2, new AutoTransition());
                    expandableveiw1_2.setVisibility(View.GONE);
                }
            }
        });
        button1_3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(expandableveiw1_3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView1_3, new AutoTransition());
                    expandableveiw1_3.setVisibility(View.VISIBLE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView1_3, new AutoTransition());
                    expandableveiw1_3.setVisibility(View.GONE);
                }
            }
        });


        return view;
    }

}