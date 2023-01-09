package jr.app.peschampsleague.adaptersTab;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import jr.app.peschampsleague.partidas.Finais;
import jr.app.peschampsleague.partidas.Jogos;
import jr.app.peschampsleague.partidas.SemiFinais;

public class AdapterPartidas extends FragmentStatePagerAdapter {

    private final int tabCount;

    public AdapterPartidas(FragmentManager fm, int tabCount) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.tabCount = tabCount;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                return new Jogos();
            case 1:
                return new SemiFinais();
            case 2:
                return new Finais();
            default:
                return null;
        }
    }

    @Override
    public int getCount() {
        return tabCount;
    }

    @Override
    public int getItemPosition(@NonNull Object object) {
        return POSITION_NONE;
    }

}
