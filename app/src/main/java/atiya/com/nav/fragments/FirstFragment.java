package atiya.com.nav.fragments;

import android.os.Bundle;
import android.support.v4.app.ListFragment;
import android.view.View;
import android.widget.ListView;

import atiya.com.nav.R;
import atiya.com.nav.activity.CustomList;
import atiya.com.nav.interfaces.OnListSelectionChangeListener;

public class FirstFragment extends ListFragment {


  // Mandatory empty constructor for the fragment manager to instantiate the fragment

  public FirstFragment() {

  }
    String[] web = {
            "Emtyness ft justin tiblekar",
            "I am falling love with you",
            "Baby ft justin babier"
    } ;
    Integer[] imageId = {
            R.drawable.emptyness,
            R.drawable.falling,
            R.drawable.babyfeet

    };
  @Override
  public void onActivityCreated(Bundle savedInstanceState) {
      super.onActivityCreated(savedInstanceState);


      CustomList adapter = new
              CustomList(getActivity(), web, imageId);
//      ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_list_item_1, songsList);
      setListAdapter(adapter);
  }

  @Override
  public void onListItemClick(ListView l, View v, int position, long id) {
      OnListSelectionChangeListener listener = (OnListSelectionChangeListener) getActivity();
      listener.OnSelectionChanged(position);
  }
}