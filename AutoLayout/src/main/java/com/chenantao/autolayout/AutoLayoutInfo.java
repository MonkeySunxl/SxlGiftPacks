package com.chenantao.autolayout;

import android.view.View;

import com.chenantao.autolayout.attr.AutoAttr;

import java.util.ArrayList;
import java.util.List;

public class AutoLayoutInfo
{
	private List<AutoAttr> autoAttrs = new ArrayList<>();

	public void addAttr(AutoAttr autoAttr)
	{
		autoAttrs.add(autoAttr);
	}


	public void fillAttrs(View view)
	{
		for (AutoAttr autoAttr : autoAttrs)
		{
			autoAttr.apply(view);
		}
	}

	@Override
	public String toString()
	{
		return "AutoLayoutInfo{" +
				"autoAttrs=" + autoAttrs +
				'}';
	}
}