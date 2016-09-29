package com.gyc.mydagger2demo.di;

import android.os.Bundle;
import android.provider.Settings;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;


import com.gyc.mydagger2demo.MainActivity;
import com.gyc.mydagger2demo.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

/**
 * Created by maoczsd on 2016/9/29.
 */
public class AndroidFragment extends Fragment {
    public static AndroidFragment instance = null ;
    private String tag = "AndroidFragment";

    public static AndroidFragment getInstance() {
        if(instance == null){
            instance = new AndroidFragment();
        }
        return instance;
    }

    @BindView(R.id.textView)
    TextView textView;

    @Inject TextBean textBean ;
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        AndroidFragmentComponent androidFragmentComponent = ((MainActivity) getActivity()).getMainActivityComponent().androidFragmentComponent();
        androidFragmentComponent.inject(this);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        LinearLayout fg_main = (LinearLayout) View.inflate(getActivity(), R.layout.fragment_android, null);
        ButterKnife.bind(this , fg_main);
        fg_main.findViewById(R.id.textView2).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                textBean.print("这是对象注入成功后需要显示的数据");
                ((MainActivity)getActivity()).mainTestBean.print("这是Fragment中填入的参数");
            }
        });
        fg_main.findViewById(R.id.textView).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.e("text" , "点击有效");
            }
        });
        return fg_main;
    }
}
