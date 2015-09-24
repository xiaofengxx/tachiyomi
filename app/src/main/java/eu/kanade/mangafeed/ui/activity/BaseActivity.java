package eu.kanade.mangafeed.ui.activity;

import android.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;

import eu.kanade.mangafeed.App;
import eu.kanade.mangafeed.AppComponent;

public class BaseActivity extends AppCompatActivity {

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case android.R.id.home:
                FragmentManager fm = getFragmentManager();
                if (fm.getBackStackEntryCount() > 0) {
                    fm.popBackStack(null, FragmentManager.POP_BACK_STACK_INCLUSIVE);
                } else {
                    finish();
                }
                return true;
            default:
                return super.onOptionsItemSelected(item);
        }
    }

    protected AppComponent applicationComponent() {
        return App.get(this).getComponent();
    }

}
