package kittichai.th.bsruservice;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MainFragment extends Fragment {


    public MainFragment() {}

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        // Register Controller

        registerController();
        OnePage();
        TwoPage();

    } //Main Method
    private void OnePage() {
        TextView textView = getView().findViewById(R.id.txtOnePage);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant,new OnePage())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void TwoPage() {
        TextView textView = getView().findViewById(R.id.txtTwoPage);
        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                //Replace Fragment
                getActivity()
                        .getSupportFragmentManager()
                        .beginTransaction()
                        .replace(R.id.layoutMainFragmant,new TwoPage())
                        .addToBackStack(null)
                        .commit();
            }
        });
    }
    private void registerController() {
    TextView textView = getView().findViewById(R.id.txtRegister);
    textView.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {

            //Replace Fragment
            getActivity()
                    .getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.layoutMainFragmant,new RegisterFragment())
                    .addToBackStack(null)
                    .commit();
        }
    });
}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }


}
