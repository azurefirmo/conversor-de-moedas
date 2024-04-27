package gui.screens;

import gui.utils.Util;
import units.Mass;
import units.Unit;

import javax.swing.*;

public class ScreenMass extends Screen {

    @Override
    public Unit[] getValues() {
        return Mass.getAll();
    }

    @Override
    public String getName() {
        return "Massa";
    }

    @Override
    public ImageIcon getImageIcon() {
        return Util.getImageIcon("images/mass.png");
    }
}