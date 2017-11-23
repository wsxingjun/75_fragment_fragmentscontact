package it.oztaking.com.a75_fragment_fragmentscontact;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Administrator on 2017-11-23.
 */

public class Fragment1 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment1, null);

        View bt_change = view.findViewById(R.id.bt_change);
        bt_change.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Fragment2 fragment = (Fragment2)getActivity().getFragmentManager().findFragmentByTag("f2");
                fragment.setText("haha");

            }
        });

        return view;
    }
}
