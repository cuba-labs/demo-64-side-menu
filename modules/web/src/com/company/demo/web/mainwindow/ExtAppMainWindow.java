package com.company.demo.web.mainwindow;

import com.haulmont.cuba.gui.components.AbstractMainWindow;
import com.haulmont.cuba.gui.components.Embedded;
import com.haulmont.cuba.gui.components.mainwindow.FtsField;
import com.haulmont.cuba.gui.components.mainwindow.SideMenu;

import javax.inject.Inject;
import java.util.Map;

public class ExtAppMainWindow extends AbstractMainWindow {
    @Inject
    private FtsField ftsField;

    @Inject
    private Embedded logoImage;

    @Inject
    private SideMenu sideMenu;

    @Override
    public void init(Map<String, Object> params) {
        super.init(params);

        sideMenu.requestFocus();

        initLayoutAnalyzerContextMenu(logoImage);
        initLogoImage(logoImage);
        initFtsField(ftsField);
    }
}