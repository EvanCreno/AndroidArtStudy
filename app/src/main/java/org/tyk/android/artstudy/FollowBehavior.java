package org.tyk.android.artstudy;

import android.content.Context;
import android.support.design.widget.CoordinatorLayout;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by tangyangkai on 2016/12/21.
 */

public class FollowBehavior extends CoordinatorLayout.Behavior<TextView> {

    public FollowBehavior(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    //当dependency是Button类的实例时返回true，
    //就可以让系统知道布局文件中的Button就是本次交互行为中的dependent view
    @Override
    public boolean layoutDependsOn(CoordinatorLayout parent, TextView child, View dependency) {
        return dependency instanceof Button;
    }


    @Override
    public boolean onDependentViewChanged(CoordinatorLayout parent, TextView child, View dependency) {

        child.setX(dependency.getX() + 200);
        child.setY(dependency.getY() + 200);
        return true;
    }
}
