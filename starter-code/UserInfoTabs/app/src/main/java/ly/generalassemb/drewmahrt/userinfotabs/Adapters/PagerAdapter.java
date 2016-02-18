package ly.generalassemb.drewmahrt.userinfotabs.Adapters;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import ly.generalassemb.drewmahrt.userinfotabs.Classes.ContactFragment;
import ly.generalassemb.drewmahrt.userinfotabs.Classes.PersonalInfoFragment;
import ly.generalassemb.drewmahrt.userinfotabs.Classes.PictureFragment;

/**
 * Created by drewmahrt on 2/18/16.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    int mNumOfTabs;

    public PagerAdapter(FragmentManager fm, int NumOfTabs) {
        super(fm);
        this.mNumOfTabs = NumOfTabs;
    }

    @Override
    public Fragment getItem(int position) {

        switch (position) {
            case 0:
                PictureFragment tab1 = new PictureFragment();
                return tab1;
            case 1:
                PersonalInfoFragment tab2 = new PersonalInfoFragment();
                return tab2;
            case 2:
                ContactFragment tab3 = new ContactFragment();
                return tab3;
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return mNumOfTabs;
    }
}
