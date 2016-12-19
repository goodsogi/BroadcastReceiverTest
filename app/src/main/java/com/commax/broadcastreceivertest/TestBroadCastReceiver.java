package com.commax.broadcastreceivertest;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.widget.Toast;

public class TestBroadCastReceiver extends BroadcastReceiver {

	@Override
	public void onReceive(Context context, Intent intent) {
		// TODO Auto-generated method stub

		Toast.makeText(context.getApplicationContext(), intent.getAction() , Toast.LENGTH_SHORT).show();

	}

}
