package it.oztaking.com.a75_fragment_fragmentscontact;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by Administrator on 2017-11-23.
 */

public class Fragment2 extends Fragment {
    TextView tv_text;
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment2, null);

        tv_text = (TextView) view.findViewById(R.id.tv_text);
        return view;
    }

    public void setText(String string){

        tv_text.setText(string);
    }
}
