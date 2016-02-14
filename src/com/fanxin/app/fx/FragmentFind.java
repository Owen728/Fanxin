package com.fanxin.app.fx;





import com.fanxin.app.Pedometer;
import com.fanxin.app.R;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.View.OnClickListener;
import android.widget.RelativeLayout;

public class FragmentFind  extends Fragment{
 
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		return inflater.inflate(R.layout.fragment_find, container, false);
	}

	@Override
	public void onActivityCreated(Bundle savedInstanceState) {
		super.onActivityCreated(savedInstanceState);
		 
		RelativeLayout re_erweima = (RelativeLayout) getView().findViewById(
                R.id.re_erweima);
		re_erweima.setOnClickListener(new OnClickListener() {

            @Override
            public void onClick(View v) {
                startActivity(new Intent(getActivity(), Pedometer.class));
            }

        });
		}
	
	
	 
}
