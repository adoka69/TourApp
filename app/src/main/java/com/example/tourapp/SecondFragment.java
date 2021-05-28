package com.example.tourapp;

import android.opengl.Visibility;
import android.os.Build;
import android.os.Bundle;

import androidx.annotation.RequiresApi;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;

import android.text.method.LinkMovementMethod;
import android.transition.AutoTransition;
import android.transition.TransitionManager;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

public class SecondFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_second, container, false);

        Button button = view.findViewById(R.id.show_info2_1);
        LinearLayout expandableveiw = view.findViewById(R.id.expandable_view2_1);
        CardView cardView = view.findViewById(R.id.cardview_expandable2_1);

        Button button2 = view.findViewById(R.id.show_info2_2);
        LinearLayout expandableveiw2 = view.findViewById(R.id.expandable_view2_2);
        CardView cardView2 = view.findViewById(R.id.cardview_expandable2_2);

        Button button3 = view.findViewById(R.id.show_info2_3);
        LinearLayout expandableveiw3 = view.findViewById(R.id.expandable_view2_3);
        CardView cardView3 = view.findViewById(R.id.cardview_expandable2_3);

        TextView linktextview1 = view.findViewById(R.id.textView2_1_3);
        linktextview1.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linktextview2= view.findViewById(R.id.textView2_2_3);
        linktextview2.setMovementMethod(LinkMovementMethod.getInstance());

        TextView linktextview3= view.findViewById(R.id.textView2_3_3);
        linktextview2.setMovementMethod(LinkMovementMethod.getInstance());


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
        button2.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(expandableveiw2.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableveiw2.setVisibility(View.VISIBLE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView2, new AutoTransition());
                    expandableveiw2.setVisibility(View.GONE);
                }
            }
        });
        button3.setOnClickListener(new View.OnClickListener() {
            @RequiresApi(api = Build.VERSION_CODES.KITKAT)
            @Override
            public void onClick(View v) {
                if(expandableveiw3.getVisibility()==View.GONE){
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableveiw3.setVisibility(View.VISIBLE);
                }
                else {
                    TransitionManager.beginDelayedTransition(cardView3, new AutoTransition());
                    expandableveiw3.setVisibility(View.GONE);
                }
            }
        });

        return view;
    }

}