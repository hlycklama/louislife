package com.louislife.controller;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.Initializable;

import com.louislife.UI.ControlledScreen;
import com.louislife.UI.ScreensController;

public class TeamController implements Initializable,
ControlledScreen {

	ScreensController controller;

	/** XML Properties **/
	
	@Override
	public void setScreenParent(ScreensController screenParent) {
		controller= screenParent;
	}

	@Override
	public void initialize(URL location, ResourceBundle resources) {


	}
}