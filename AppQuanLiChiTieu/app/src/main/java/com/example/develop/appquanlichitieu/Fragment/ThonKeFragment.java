package com.example.develop.appquanlichitieu.Fragment;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.develop.appquanlichitieu.R;
import com.example.develop.appquanlichitieu.ThisMonthActivity;
import com.example.develop.appquanlichitieu.ThisWeekActivity;
import com.example.develop.appquanlichitieu.ThisYearActitvity;
import com.example.develop.appquanlichitieu.TodayActivity;


public class ThonKeFragment extends Fragment implements View.OnClickListener {
//    RelativeLayout mainLayout;
//
//

    CardView today,thisweek,thismonth,thisyear;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_thongke, container, false);
        today=view.findViewById(R.id.today);
        thisweek=view.findViewById(R.id.thisweek);
        thismonth=view.findViewById(R.id.thismonth);
        thisyear=view.findViewById(R.id.thisyear);
        today.setOnClickListener(this);
        thisweek.setOnClickListener(this);
        thismonth.setOnClickListener(this);
        thisyear.setOnClickListener(this);

       return view;

    }

    @Override
    public void onClick(View view) {
        FragmentManager fragmentManager = getActivity().getSupportFragmentManager();
        int id=view.getId();
        switch (id){
            case R.id.today:
                Fragment fragment = new TodayActivity();

                FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();
                fragmentTransaction.replace(R.id.content, fragment);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.thisweek:
                Fragment fragmentweek = new ThisWeekActivity();

                FragmentTransaction fragmentTransactionweek = fragmentManager.beginTransaction();
                fragmentTransactionweek.replace(R.id.content, fragmentweek);
                fragmentTransactionweek.addToBackStack(null);
                fragmentTransactionweek.commit();
                break;

            case R.id.thismonth:
                Fragment fragmentmonth = new ThisMonthActivity();

                FragmentTransaction fragmentTransactionmonth = fragmentManager.beginTransaction();
                fragmentTransactionmonth.replace(R.id.content, fragmentmonth);
                fragmentTransactionmonth.addToBackStack(null);
                fragmentTransactionmonth.commit();
                break;

            case R.id.thisyear:
                Fragment fragmentyear = new ThisYearActitvity();
                FragmentTransaction fragmentTransactionyear = fragmentManager.beginTransaction();
                fragmentTransactionyear.replace(R.id.content, fragmentyear);
                fragmentTransactionyear.addToBackStack(null);
                fragmentTransactionyear.commit();
                break;

        }
    }
}
