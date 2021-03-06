package slogo.tabmanager;

import java.util.Observable;
import java.util.Observer;
import javafx.stage.Stage;
import slogo.controller.Controller;
import slogo.view.TabPreference;

public class TabController implements Observer {

	static int myTabIndex = 0;

	private Stage myStage;
	private TabView tabView;

	public TabController(Stage myStage) {
		this.myStage = myStage;

		Controller newController = new Controller(myTabIndex, myStage, false, TabPreference.NEW);
		newController.addObserver(this);
		tabView = new TabView();
		tabView.add(new TabPackage(newController, myTabIndex));
		newController.updateCurrentTab(myTabIndex);
		myTabIndex++;

	}

	void createTab(TabPreference preference) {
		Controller newController = new Controller(myTabIndex, myStage, true, preference);
		newController.addObserver(this);
		tabView.add(new TabPackage(newController, myTabIndex));
		newController.updateCurrentTab(myTabIndex);
		myTabIndex++;
	}

	@Override
	public void update(Observable observed, Object newValue) {
		if (observed instanceof Controller) {
			if (newValue instanceof Boolean) {
				TabPreference newTab = TabPreference.NEW;
				createTab(newTab);
			}
			if (newValue instanceof String) {
				TabPreference loadTab = TabPreference.LOAD;
				loadTab.setIndex((String) newValue);
				createTab(loadTab);
			}
		}
	}

}
