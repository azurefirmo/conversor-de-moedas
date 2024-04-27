package gui.screens;

import gui.utils.Util;
import units.DataStorage;
import units.Unit;

import javax.swing.*;

public class ScreenDataStorage extends Screen {

    @Override
    public Unit[] getValues() {
        return DataStorage.getAll();
    }

    @Override
    public String getName() {
        return "Armazenamento";
    }

    @Override
    public ImageIcon getImageIcon() {
        return Util.getImageIcon("images/datastorage.png");
    }

}