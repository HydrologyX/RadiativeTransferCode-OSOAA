package osoaa.usl.common.ui.jspinner;

import javax.swing.*;

public class OptionalSpinnerNumberModel extends AbstractSpinnerModel {

	private Object currentValue = null;
	private SpinnerNumberModel snm;

	public SpinnerNumberModel getSpinnerNumberModel(){
		return snm;
	}
	public OptionalSpinnerNumberModel(SpinnerNumberModel snm_) {
        super();
        snm = snm_;
    }

	@Override
    public Object getNextValue() {
    	if (getValue() == null) {
    		currentValue = snm.getValue();
        } else {
        	currentValue = snm.getNextValue();
        	if( snm.getMaximum() != null && (currentValue == null  || snm.getMaximum().compareTo(currentValue)<0) ){
        		currentValue = snm.getMaximum();
        	}
        }
    	fireStateChanged();
        return currentValue;
    }

    @Override
    public Object getPreviousValue() {
        if (getValue() == null) {
        	currentValue = snm.getValue();
        } else {
        	currentValue = snm.getPreviousValue();
        	if( snm.getMinimum() != null && (currentValue == null  ||  snm.getMinimum().compareTo(currentValue)>0) ){
        		currentValue = snm.getMinimum();
        	}
        }
        fireStateChanged();
        return currentValue;
    }

    @Override
    public void setValue(Object value){
    	boolean fireChanges = false;
    	if(value instanceof Number){
    		if(currentValue == null){
    			fireChanges = true;
    		}
    		currentValue = (Number)value;
    		snm.setValue(currentValue);
    	} else {
    		if(currentValue != null){
    			fireChanges = true;
    		}
    		currentValue = null;
    	}

    	if(fireChanges ){
			fireStateChanged();
		}
    }

	@Override
	public Object getValue() {
		return currentValue;
	}

}
