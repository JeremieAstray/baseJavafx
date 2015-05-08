package com.jeremie.baseJavafx.controller;

import com.jeremie.baseJavafx.service.FooService;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by jeremie on 15/5/8.
 */
@Controller
public class MainController implements Initializable {

    @Autowired
    private FooService fooService;
    @FXML
    private TextField textField;

    @FXML
    private void okEvent(ActionEvent event) {
        textField.setText(fooService.findFooById(1).getText());
    }

    @FXML
    private void cancelEvent(ActionEvent eventt) {
        textField.setText("cancel");
    }

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }
}
