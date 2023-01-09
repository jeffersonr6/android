package jr.app.peschampsleague;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;

public class ListaPartidas extends Fragment {

    public View rootFrag;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        rootFrag = inflater.inflate(R.layout.listapartidas, container, false);

//        Chamar layout Partida quando necessario.
//        LinearLayout lnr = rootFrag.findViewById(R.id.lnrBasePartidas);
//        lnr.setOnClickListener(new View.OnClickListener(){
//            @Override
//            public void onClick(View v) {
//                Toast.makeText(getActivity().getApplicationContext(),"Partida", Toast.LENGTH_LONG).show();
//                getActivity().getSupportFragmentManager()
//                        .beginTransaction()
//                        .replace(R.id.nav_host_fragment, new Partida())
//                        .commit();
//            }
//        });

        return rootFrag;
    }
}
