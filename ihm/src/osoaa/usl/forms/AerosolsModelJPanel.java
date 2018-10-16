package osoaa.usl.forms;

import java.awt.BorderLayout;
import java.awt.CardLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.math.BigDecimal;

import javax.swing.BoxLayout;
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JRadioButton;
import javax.swing.JSeparator;
import javax.swing.JSpinner;
import javax.swing.JTextField;
import javax.swing.SpinnerNumberModel;
import javax.swing.SwingConstants;
import javax.swing.UIManager;
import javax.swing.border.MatteBorder;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;

import org.apache.log4j.Logger;

import osoaa.bll.domain.AERMMDSDTypeEnum;
import osoaa.bll.domain.AERSFModelEnum;
import osoaa.bll.domain.AERWMOModelEnum;
import osoaa.bll.domain.AerosolModelTypeEnum;
import osoaa.bll.exception.InitException;
import osoaa.bll.preferences.IAerosolsModel;
import osoaa.bll.preferences.IAtmosphericAndSeaProfiles;
import osoaa.bll.preferences.ICommonPreferences;
import osoaa.bll.preferences.PreferencesFactory;
import osoaa.bll.properties.PropertiesManager;
import osoaa.usl.common.ui.forms.FormUtils;

import com.jgoodies.forms.factories.DefaultComponentFactory;
import com.jgoodies.forms.factories.FormFactory;
import com.jgoodies.forms.layout.ColumnSpec;
import com.jgoodies.forms.layout.FormLayout;
import com.jgoodies.forms.layout.RowSpec;
import osoaa.usl.common.ui.jspinner.JSpinnerRangedValue;
import osoaa.usl.common.ui.jspinner.SpinnerBigDecimalModel;

public class AerosolsModelJPanel extends AbstractForm {
	/**
	 * 
	 */
	private Logger log = Logger.getLogger(this.getClass().getCanonicalName());
	
	private static final long serialVersionUID = 1L;
	private JTextField AERResFile_txtField;

	private IAtmosphericAndSeaProfiles atmosphericAndSeaProfiles;
	private ICommonPreferences commonPreferences;
	private IAerosolsModel aerosolsModel;

	private JLabel SEABotType_Desc;
	private JSpinner AERMMDJDrmin_spinner;
	private JSpinner AERMMDJDrmax_spinner;
	private JSpinner AERMMDMRwa_spinner;
	private JLabel AERMMDJDrmax_desc;
	private JLabel AERMMDJDrmax_title;
	private JLabel AERDirMie_title;
	private JLabel AERMMDJDslope_title;
	private JSpinner AERMMDMIwaref_spinner;
	private JLabel AERWMODL_desc;
	private JSpinner AERWMODL_spinner;
	private JLabel AERWMODL_title;
	private JLabel AERBMDCoarseVC_desc;
	private JLabel AERBMDVCdef_title;
	private JLabel AERBMDVCdef_desc;
	private JLabel AERBMDFineVC_title;
	private JLabel AERBMDRAOT_title;
	private JSpinner AERBMDRAOT_spinner;
	private JSpinner AERBMDFineVC_spinner;
	private JLabel AERBMDFineVC_desc;
	private JLabel AERBMDRAOT_desc;
	private JLabel AERBMDCMMIwa_title;
	private JLabel AERBMDCMMIwa_desc;
	private JSpinner AERBMDCMSDradius_spinner;
	private JSpinner AERBMDCMMRwa_spinner;
	private JLabel AERBMDCMMRwa_title;
	private JLabel AERBMDCMMRwa_desc;
	private JLabel AERResFile_title;
	private JLabel AERLog_title;
	private JLabel AERMMDMRwa_title;
	private JLabel AERModel_title;
	private JLabel AERMMDMIwaref_title;
	private JLabel AERWMOModel_title;
	private JLabel AERBMDCoarseVC_title;
	private JLabel AERBMDCMSDradius_title;
	private JComboBox AERModel_combobox;
	private JPanel panel_2;
	private JTextField AERDirMie_textField;
	private JTextField AERMieLog_textField;
	private JTextField AERLog_textField;
	private JLabel lblLogFilenameOf;
	private JLabel lblPhaseFunctionTruncation;
	private JLabel AERTronca_title;
	private JCheckBox AERTronca_checkbox;
	private JLabel lblAerosols_1;
	private JLabel AERMMDMIwa_title;
	private JLabel AERMMDSDType_title;
	private JSpinner AERMMDMIwa_spinner;
	private JComboBox AERMMDSDType_combo;
	private JLabel AERMMDMIwa_desc;
	private JLabel AERMMDSDType_desc;
	private JLabel AERMMDMRwa_desc;
	private JLabel AERMMDLNDradius_title;
	private JSpinner AERMMDLNDradius_spinner;
	private JLabel AERMMDLNDradius_desc;
	private JLabel AERMMDLNDvar_desc;
	private JSpinner AERMMDLNDvar_spinner;
	private JLabel AERMMDLNDvar_title;
	private JSpinner AERMMDJDslope_spinner;
	private JLabel AERMMDJDrmin_title;
	private JLabel AERMMDMRwaref_title;
	private JLabel AERMMDMRwaref_desc;
	private JSpinner AERMMDMRwaref_spinner;
	private JLabel AERWMOModel_desc;
	private JComboBox AERWMOModel_comboBox;
	private JLabel AERWMOWS_title;
	private JLabel AERWMOOC_title;
	private JLabel AERWMOWS_desc;
	private JLabel AERWMOOC_desc;
	private JSpinner AERWMOWS_spinner;
	private JSpinner AERWMOOC_spinner;
	private JSpinner AERWMOSO_spinner;
	private JLabel AERWMOSO_title;
	private JLabel AERWMOSO_desc;
	private JPanel panel_1;
	private JRadioButton AERBMDVCdef_choice1_RadioButton;
	private JRadioButton AERBMDVCdef_choice2_RadioButton;
	private JSpinner AERBMDCoarseVC_spinner;
	private JSpinner AERBMDCMMIwa_spinner;
	private JLabel AERBMDCMSDvar_title;
	private JSpinner AERBMDCMSDvar_spinner;
	private JLabel AERBMDCMSDvar_desc;
	private JLabel AERBMDCMMRwaref_title;
	private JSpinner AERBMDCMMRwaref_spinner;
	private JLabel AERBMDCMMRwaref_desc;
	private JLabel AERBMDCMMIwaref_title;
	private JSpinner AERBMDCMMIwaref_spinner;
	private JLabel AERBMDCMMIwaref_desc;
	private JLabel AERBMDFMMRwa_title;
	private JSpinner AERBMDFMMRwa_spinner;
	private JComponent AERBMDFMMRwa_desc;
	private JLabel AERBMDFMMIwa_title;
	private JSpinner AERBMDFMMIwa_spinner;
	private JLabel AERBMDFMMIwa_desc;
	private JLabel AERBMDFMSDradius_desc;
	private JSpinner AERBMDFMSDradius_spinner;
	private JLabel AERBMDFMSDradius_title;
	private JLabel AERBMDFMSDvar_title;
	private JSpinner AERBMDFMSDvar_spinner;
	private JLabel AERBMDFMSDvar_desc;
	private JLabel AERBMDFMMRwaref_title;
	private JSpinner AERBMDFMMRwaref_spinner;
	private JLabel AERBMDFMMRwaref_desc;
	private JLabel AERBMDFMMIwaref_title;
	private JSpinner AERBMDFMMIwaref_spinner;
	private JLabel AERBMDFMMIwaref_desc;
	private JLabel AERExtData_title;
	private JTextField AERExtData_textField;
	private JLabel AERExtData_desc;
	private JLabel AERMieLog_title;
	private JLabel AERBMDCMSDradius_desc;
	private JLabel AERMMDJDrmin_desc;
	private JLabel AERMMDJDslope_desc;
	private JLabel AERMMDMIwaref_desc;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	private JLabel labelSeparator1_AerModel3;
	private JSeparator jseparator1_AerModel3;
	private JSeparator jseparator2_AerModel3;
	private JLabel labelSeparator2_AerModel3;
	private JPanel aerModelContentFormJp;
	private JLabel AERSFModel_title;
	private JComboBox AERSFModel_comboBox;
	private JLabel AERSFModel_desc;
	private JLabel AERSFRH_title;
	private JSpinner AERSFRH_spinner;
	private JLabel AERSFRH_desc;

	public void init() {
		aerosolsModel = PreferencesFactory.getInstance().getAerosolsModel();
		atmosphericAndSeaProfiles = PreferencesFactory.getInstance()
				.getAtmosphericAndSeaProfiles();
		commonPreferences = PreferencesFactory.getInstance()
				.getCommonPreferences();

		AERResFile_txtField.setText(aerosolsModel.getAERResFile());
		AERDirMie_textField.setText(aerosolsModel.getAERDirMie());
		AERMieLog_textField.setText(aerosolsModel.getAERMieLog());
		AERLog_textField.setText(aerosolsModel.getAERLog());
		AERTronca_checkbox.setSelected(aerosolsModel.getAERTronca());
		AERModel_combobox.setSelectedIndex( aerosolsModel.getAERModel() );
		AERMMDMRwa_spinner.setValue(aerosolsModel.getAERMMDMRwa());
		AERMMDMIwa_spinner.setValue(aerosolsModel.getAERMMDMIwa());
		AERMMDSDType_combo.setSelectedIndex( Math.max(0, aerosolsModel.getAERMMDSDtype()-1 ));
		AERMMDLNDradius_spinner.setValue(aerosolsModel.getAERMMDLNDradius());
		AERMMDLNDvar_spinner.setValue(aerosolsModel.getAERMMDLNDvar());
		AERMMDJDslope_spinner.setValue(aerosolsModel.getAERMMDJDslope());
		AERMMDJDrmin_spinner.setValue(aerosolsModel.getAERMMDJDrmin());
		AERMMDJDrmax_spinner.setValue(aerosolsModel.getAERMMDJDrmax());
		AERMMDMRwaref_spinner.setValue(aerosolsModel.getAERMMDMRwaref());
		AERMMDMIwaref_spinner.setValue(aerosolsModel.getAERMMDMIwaref());
		AERWMOModel_comboBox.setSelectedIndex( Math.max(0, aerosolsModel.getAERWMOModel()-1 ));
		AERWMODL_spinner.setValue(aerosolsModel.getAERWMODL());
		AERWMOWS_spinner.setValue(aerosolsModel.getAERWMOWS());
		AERWMOOC_spinner.setValue(aerosolsModel.getAERWMOOC());
		AERWMOSO_spinner.setValue(aerosolsModel.getAERWMOSO());
		AERSFModel_comboBox.setSelectedIndex( Math.max(0, aerosolsModel.getAERSFModel()-1 ));
		AERSFRH_spinner.setValue(aerosolsModel.getAERSFRH());
		AERBMDVCdef_choice1_RadioButton.setSelected(aerosolsModel
				.getAERBMDVCdef() == 1);
		AERBMDVCdef_choice2_RadioButton.setSelected(aerosolsModel
				.getAERBMDVCdef() == 2);
		AERBMDCoarseVC_spinner.setValue(aerosolsModel.getAERBMDCoarseVC());
		AERBMDFineVC_spinner.setValue(aerosolsModel.getAERBMDFineVC());
		AERBMDRAOT_spinner.setValue(aerosolsModel.getAERBMDRAOT());
		AERBMDCMMRwa_spinner.setValue(aerosolsModel.getAERBMDCMMRwa());
		AERBMDCMMIwa_spinner.setValue(aerosolsModel.getAERBMDCMMIwa());
		AERBMDCMSDradius_spinner.setValue(aerosolsModel.getAERBMDCMSDradius());
		AERBMDCMSDvar_spinner.setValue(aerosolsModel.getAERBMDCMSDvar());
		AERBMDCMMRwaref_spinner.setValue(aerosolsModel.getAERBMDCMMRwaref());
		AERBMDCMMIwaref_spinner.setValue(aerosolsModel.getAERBMDCMMIwaref());
		AERBMDFMMRwa_spinner.setValue(aerosolsModel.getAERBMDFMMRwa());
		AERBMDFMMIwa_spinner.setValue(aerosolsModel.getAERBMDFMMIwa());
		AERBMDFMSDradius_spinner.setValue(aerosolsModel.getAERBMDFMSDradius());
		AERBMDFMSDvar_spinner.setValue(aerosolsModel.getAERBMDFMSDvar());
		AERBMDFMMRwaref_spinner.setValue(aerosolsModel.getAERBMDFMMRwaref());
		AERBMDFMMIwaref_spinner.setValue(aerosolsModel.getAERBMDFMMIwaref());
		AERExtData_textField.setText(aerosolsModel.getAERExtData());

		onAERModelItemChanged( aerosolsModel.getAERModel() );
		check_AERWaref_VS_OSOAAWa_Condition();
		
		validateForm();
	}
	
	private void check_AERWaref_VS_OSOAAWa_Condition(){
		boolean condition = atmosphericAndSeaProfiles.getAERWaref().doubleValue() != commonPreferences.getRadianceWaveLength().doubleValue();
		setAERMMDMRwarefVisible(condition && getAERModel()==0);
		setAERMMDMIwarefVisible(condition && getAERModel()==0);
		
		setAERBMDFMMRwarefVisible(condition && getAERModel()==3);
		setAERBMDFMMIwarefVisible(condition && getAERModel()==3);
	}

	private void validateForm() {
		validateAerosolsModelForm();

		notifyFormValidated();
	}

	private void validateFormInitToFalse() {
		FormUtils.setFieldState(false, AERResFile_title);
		FormUtils.setFieldState(false, AERDirMie_title);
		FormUtils.setFieldState(false, AERMieLog_title);
		FormUtils.setFieldState(false, AERLog_title);
		FormUtils.setFieldState(false, AERTronca_title);
		FormUtils.setFieldState(false, AERModel_title);
		FormUtils.setFieldState(false, AERMMDMRwa_title);
		FormUtils.setFieldState(false, AERMMDMIwa_title);
		FormUtils.setFieldState(false, AERMMDSDType_title);
		FormUtils.setFieldState(false, AERMMDLNDradius_title);
		FormUtils.setFieldState(false, AERMMDLNDvar_title);
		FormUtils.setFieldState(false, AERMMDJDslope_title);
		FormUtils.setFieldState(false, AERMMDJDrmin_title);
		FormUtils.setFieldState(false, AERMMDJDrmax_title);
		FormUtils.setFieldState(false, AERMMDMRwaref_title);
		FormUtils.setFieldState(false, AERMMDMIwaref_title);
		FormUtils.setFieldState(false, AERWMOModel_title);
		FormUtils.setFieldState(false, AERWMODL_title);
		FormUtils.setFieldState(false, AERWMOWS_title);
		FormUtils.setFieldState(false, AERWMOOC_title);
		FormUtils.setFieldState(false, AERWMOSO_title);
		FormUtils.setFieldState(false, AERSFModel_title);
		FormUtils.setFieldState(false, AERSFRH_title);
		FormUtils.setFieldState(false, AERBMDVCdef_title);
		FormUtils.setFieldState(false, AERBMDCoarseVC_title);
		FormUtils.setFieldState(false, AERBMDFineVC_title);
		FormUtils.setFieldState(false, AERBMDRAOT_title);
		FormUtils.setFieldState(false, AERBMDCMMRwa_title);
		FormUtils.setFieldState(false, AERBMDCMMIwa_title);
		FormUtils.setFieldState(false, AERBMDCMSDradius_title);
		FormUtils.setFieldState(false, AERBMDCMSDvar_title);
		FormUtils.setFieldState(false, AERBMDCMMRwaref_title);
		FormUtils.setFieldState(false, AERBMDCMMIwaref_title);
		FormUtils.setFieldState(false, AERBMDFMMRwa_title);
		FormUtils.setFieldState(false, AERBMDFMMIwa_title);
		FormUtils.setFieldState(false, AERBMDFMSDradius_title);
		FormUtils.setFieldState(false, AERBMDFMSDvar_title);
		FormUtils.setFieldState(false, AERBMDFMMRwaref_title);
		FormUtils.setFieldState(false, AERBMDFMMIwaref_title);
		FormUtils.setFieldState(false, AERExtData_title);
	}

	private boolean validateAerosolsModelForm() {
		validateFormInitToFalse();
		boolean isValid = true;

		isValid &= FormUtils.setFieldState(
				getAERResFile().trim().length() <= 0, AERResFile_title);
		isValid &= FormUtils
				.setFieldState(
						atmosphericAndSeaProfiles.getAERAOTRef().doubleValue() >= 0.0001
								&& getAERDirMie().trim().length() <= 0,
						AERDirMie_title);

		int AERModelIndex = getAERModel();
		if (AERModelIndex == 0) {
			isValid &= FormUtils.setFieldState(getAERMMDMRwa() == null,
					AERMMDMRwa_title);
			isValid &= FormUtils.setFieldState(getAERMMDMIwa() == null,
					AERMMDMIwa_title);
			isValid &= FormUtils.setFieldState(getAERMMDSDtype() == null, AERMMDSDType_title);

			int AERMMDSDtypeIndex = getAERMMDSDtype();
			if (AERMMDSDtypeIndex == 0) {
				isValid &= FormUtils.setFieldState(
						getAERMMDLNDradius() == null, AERMMDLNDradius_title);
				isValid &= FormUtils.setFieldState(getAERMMDLNDvar() == null,
						AERMMDLNDvar_title);
			} else {
				isValid &= FormUtils.setFieldState(getAERMMDJDslope() == null,
						AERMMDJDslope_title);
				isValid &= FormUtils.setFieldState(getAERMMDJDrmin() == null,
						AERMMDJDrmin_title);
				isValid &= FormUtils.setFieldState(getAERMMDJDrmax() == null,
						AERMMDJDrmax_title);
			}

			if (atmosphericAndSeaProfiles.getAERWaref().doubleValue() != commonPreferences
					.getRadianceWaveLength().doubleValue()) {
				isValid &= FormUtils.setFieldState(getAERMMDMRwaref() == null,
						AERMMDMRwaref_title);
				isValid &= FormUtils.setFieldState(getAERMMDMIwaref() == null,
						AERMMDMIwaref_title);
			}
		} else if (AERModelIndex == 1) {
			isValid &= FormUtils.setFieldState(getAERWMOModel()==null, AERMMDMRwaref_title);
			int AERWMOModelIndex =getAERWMOModel();
			if (AERWMOModelIndex == 3) {
				isValid &= FormUtils.setFieldState(getAERWMODL() == null,
						AERWMODL_title);
				isValid &= FormUtils.setFieldState(getAERWMOWS() == null,
						AERWMOWS_title);
				isValid &= FormUtils.setFieldState(getAERWMOOC() == null,
						AERWMOOC_title);
				isValid &= FormUtils.setFieldState(getAERWMOSO() == null,
						AERWMOSO_title);
			}
		} else if (AERModelIndex == 2) {
			isValid &= FormUtils.setFieldState(getAERSFModel()==null, AERSFModel_title);
			isValid &= FormUtils.setFieldState(getAERSFRH() == null,
					AERSFRH_title);
		} else if (AERModelIndex == 3) {
			isValid &= FormUtils.setFieldState(getAERBMDVCdef() == null,
					AERBMDVCdef_title);
			if (getAERBMDVCdef()) {
				// If AER.BMD.VCdef= 1 : User-defined volumetric concentrations
				isValid &= FormUtils.setFieldState(getAERBMDCoarseVC() == null,
						AERBMDCoarseVC_title);
				isValid &= FormUtils.setFieldState(getAERBMDFineVC() == null,
						AERBMDFineVC_title);
			} else {
				// If AER.BMD.Option= 2 : Use of ratio coarse mode optical
				// thickness over total AOT
				isValid &= FormUtils.setFieldState(getAERBMDRAOT() == null,
						AERBMDRAOT_title);
			}

			// Coarse mode LND parameters
			isValid &= FormUtils.setFieldState(getAERBMDCMMRwa() == null,
					AERBMDCMMRwa_title);
			isValid &= FormUtils.setFieldState(getAERBMDCMMIwa() == null,
					AERBMDCMMIwa_title);
			isValid &= FormUtils.setFieldState(getAERBMDCMSDradius() == null,
					AERBMDCMSDradius_title);
			isValid &= FormUtils.setFieldState(getAERBMDCMSDvar() == null,
					AERBMDCMSDvar_title);

			if (atmosphericAndSeaProfiles.getAERWaref().doubleValue() != commonPreferences
					.getRadianceWaveLength().doubleValue()) {
				isValid &= FormUtils.setFieldState(
						getAERBMDCMMRwaref() == null, AERBMDCMMRwaref_title);
				isValid &= FormUtils.setFieldState(
						getAERBMDCMMIwaref() == null, AERBMDCMMIwaref_title);
			}

			// Fine mode LND parameters
			isValid &= FormUtils.setFieldState(getAERBMDFMMRwa() == null,
					AERBMDFMMRwa_title);
			isValid &= FormUtils.setFieldState(getAERBMDFMMIwa() == null,
					AERBMDFMMIwa_title);
			isValid &= FormUtils.setFieldState(getAERBMDFMSDradius() == null,
					AERBMDFMSDradius_title);
			isValid &= FormUtils.setFieldState(getAERBMDFMSDvar() == null,
					AERBMDFMSDvar_title);

			if (atmosphericAndSeaProfiles.getAERWaref().doubleValue() != commonPreferences
					.getRadianceWaveLength().doubleValue()) {
				isValid &= FormUtils.setFieldState(
						getAERBMDFMMRwaref() == null, AERBMDFMMRwaref_title);
				isValid &= FormUtils.setFieldState(
						getAERBMDFMMIwaref() == null, AERBMDFMMIwaref_title);
			}
		} else if (AERModelIndex == 4) {
			isValid &= FormUtils.setFieldState(
					getAERExtData().trim().length() <= 0, AERExtData_title);
		}

		return isValid;
	}

	/**
	 * Create the panel.
	 */
	public AerosolsModelJPanel() {
		super("Aerosols models");
		setBackground(Color.WHITE);
		getFormFieldsPanel().setAlignmentY(Component.TOP_ALIGNMENT);
		
		JPanel jpTopFormPanel = new JPanel();
		jpTopFormPanel.setAlignmentY(Component.TOP_ALIGNMENT);
		jpTopFormPanel.setBorder(new MatteBorder(0, 0, 1, 0, (Color) UIManager.getColor("InternalFrame.inactiveTitleForeground")));
		jpTopFormPanel.setBackground(Color.WHITE);
		
		FormLayout formLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,}); //RELATED_GAP_ROWSPEC
		jpTopFormPanel.setLayout(formLayout);
				
		AERResFile_title = DefaultComponentFactory.getInstance().createLabel(
				"AER.ResFile *:");
		jpTopFormPanel.add(AERResFile_title, "2, 1, right, default");

		AERResFile_txtField = new JTextField();
		AERResFile_txtField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				saveAERResFile();
				validateForm();
			}
		});
		jpTopFormPanel.add(AERResFile_txtField, "4, 1, fill, default");
		AERResFile_txtField.setColumns(10);

		JLabel lblSeaSurfaceAlbedo = DefaultComponentFactory.getInstance()
				.createLabel("Filename for the aerosol radiative properties");
		jpTopFormPanel.add(lblSeaSurfaceAlbedo, "9, 1");

		AERDirMie_title = new JLabel("AER.DirMie *:");
		AERDirMie_title.setHorizontalAlignment(SwingConstants.RIGHT);
		jpTopFormPanel.add(AERDirMie_title, "2, 3, right, default");

		AERDirMie_textField = new JTextField();
		AERDirMie_textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent arg0) {
				saveAERDirMie();
				validateForm();
			}
		});
		AERDirMie_textField.setColumns(10);
		jpTopFormPanel.add(AERDirMie_textField, "4, 3, fill, default");

		JLabel lblTypeOfSea = DefaultComponentFactory.getInstance()
				.createLabel("Mie files repository directory (full path)");
		jpTopFormPanel.add(lblTypeOfSea, "9, 3");

		AERMieLog_title = new JLabel("AER.MieLog :");
		AERMieLog_title.setHorizontalAlignment(SwingConstants.RIGHT);
		jpTopFormPanel.add(AERMieLog_title, "2, 5, right, default");

		AERMieLog_textField = new JTextField();
		AERMieLog_textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				saveAERMieLog();
				validateForm();
			}
		});
		AERMieLog_textField.setColumns(10);
		jpTopFormPanel.add(AERMieLog_textField, "4, 5, fill, default");

		SEABotType_Desc = new JLabel("Log filename of Mie calculations");
		SEABotType_Desc.setToolTipText("Log filename of Mie calculations");
		jpTopFormPanel.add(SEABotType_Desc, "9, 5");

		AERLog_title = DefaultComponentFactory.getInstance().createLabel(
				"AER.Log:");
		jpTopFormPanel.add(AERLog_title, "2, 7, right, default");

		AERLog_textField = new JTextField();
		AERLog_textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				saveAERLog();
				validateForm();
			}
		});
		AERLog_textField.setColumns(10);
		jpTopFormPanel.add(AERLog_textField, "4, 7, fill, default");

		lblLogFilenameOf = new JLabel(
				"Log filename of the OSOAA_PHASE_MATRIX routine ");
		lblLogFilenameOf
				.setToolTipText("Log filename of the OSOAA_PHASE_MATRIX routine ");
		jpTopFormPanel.add(lblLogFilenameOf, "9, 7");

		AERTronca_title = new JLabel("AER.Tronca :");
		AERTronca_title.setHorizontalAlignment(SwingConstants.RIGHT);
		jpTopFormPanel.add(AERTronca_title, "2, 9, right, default");

		AERTronca_checkbox = new JCheckBox("YES");
		AERTronca_checkbox.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent arg0) {
				if (AERTronca_checkbox.isSelected()) {
					AERTronca_checkbox.setText("YES");
				} else {
					AERTronca_checkbox.setText("NO");
				}

				saveAERTronca();
				validateForm();
			}
		});
		AERTronca_checkbox.setBackground(Color.WHITE);
		jpTopFormPanel.add(AERTronca_checkbox, "4, 9");

		lblPhaseFunctionTruncation = new JLabel("Phase function truncation");
		lblPhaseFunctionTruncation.setToolTipText("Phase function truncation");
		jpTopFormPanel.add(lblPhaseFunctionTruncation, "9, 9");

		lblAerosols_1 = new JLabel(
				"    |--> Aerosols : size distribution model");
		lblAerosols_1.setHorizontalAlignment(SwingConstants.LEFT);
		lblAerosols_1.setForeground(Color.BLUE);
		lblAerosols_1.setFont(new Font("Tahoma", Font.BOLD, 11));
		jpTopFormPanel.add(lblAerosols_1, "2, 11, 5, 1");

		JSeparator separator = new JSeparator();
		separator.setForeground(UIManager
				.getColor("InternalFrame.inactiveTitleGradient"));
		jpTopFormPanel.add(separator, "9, 11");

		AERModel_title = new JLabel("AER.Model *:");
		AERModel_title.setHorizontalAlignment(SwingConstants.RIGHT);
		jpTopFormPanel.add(AERModel_title, "2, 13, right, default");

		AERModel_combobox = new JComboBox();
		AERModel_combobox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e_) {
				JComboBox cb = (JComboBox) e_.getSource();
				int selIndex = cb.getSelectedIndex();

				onAERModelItemChanged(selIndex);

				saveAERModel();
				validateForm();
			}
		});
		getFormFieldsPanel().setLayout(new BorderLayout(0, 0));
		AERModel_combobox.setModel(new DefaultComboBoxModel(
				AerosolModelTypeEnum.values()));
		jpTopFormPanel.add(AERModel_combobox, "4, 13, fill, default");

		JLabel AERModel_Desc = new JLabel("Type of aerosol models");
		jpTopFormPanel.add(AERModel_Desc, "9, 13");

		
		getFormFieldsPanel().add(jpTopFormPanel, BorderLayout.NORTH);
		
		
		
		aerModelContentFormJp = new JPanel( new CardLayout(5, 5) );
		aerModelContentFormJp.setBackground(Color.WHITE);
		
		///////////////////////////
		JPanel aerModelMonoModalFormJp = new JPanel();
		aerModelMonoModalFormJp.setBackground(Color.WHITE);
		FormLayout aerModelMonoModalFormLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,}); //RELATED_GAP_ROWSPEC
		aerModelMonoModalFormJp.setLayout( aerModelMonoModalFormLayout );
		aerModelContentFormJp.add(aerModelMonoModalFormJp, AerosolModelTypeEnum.MONO_MODAL.name());
		
		AERMMDMRwa_title = new JLabel("                AER.MMD.MRwa *:");
		aerModelMonoModalFormJp.add(AERMMDMRwa_title, "2, 1, right, default");

		AERMMDMRwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
		aerModelMonoModalFormJp.add(AERMMDMRwa_spinner, "4, 1");
        PropertiesManager.getInstance().register(AERMMDMRwa_title, AERMMDMRwa_spinner);
		AERMMDMRwa_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERMMDMRwa();
				validateForm();
			}
		});

		AERMMDMRwa_desc = new JLabel(
				"Real part of the refractive index for the simulation wavelength");
		aerModelMonoModalFormJp.add(AERMMDMRwa_desc, "9, 1");

		AERMMDMIwa_title = new JLabel("AER.MMD.MIwa *:");
		aerModelMonoModalFormJp.add(AERMMDMIwa_title, "2, 3, right, default");

		AERMMDMIwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1),	new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERMMDMIwa_title, AERMMDMIwa_spinner);
		AERMMDMIwa_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERMMDMIwa();
                validateForm();
            }
        });
		aerModelMonoModalFormJp.add(AERMMDMIwa_spinner, "4, 3");

		AERMMDMIwa_desc = new JLabel(
				"Imaginary part of the refractive index (negative value) for the simulation wavelength  ");
		aerModelMonoModalFormJp.add(AERMMDMIwa_desc, "9, 3");

		AERMMDSDType_title = new JLabel("AER.MMD.SDtype *:");
		aerModelMonoModalFormJp.add(AERMMDSDType_title, "2, 5, right, default");

		AERMMDSDType_combo = new JComboBox();
		AERMMDSDType_combo.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e_) {
				JComboBox cb = (JComboBox) e_.getSource();
				int selIndex = cb.getSelectedIndex();

				onAERMMDSDTypeItemChanged(getAERModel(), selIndex);
				
				saveAERMMDSDtype();
				validateForm();
			}
		});
		AERMMDSDType_combo.setModel(new DefaultComboBoxModel(AERMMDSDTypeEnum
				.values()));
		aerModelMonoModalFormJp.add(AERMMDSDType_combo, "4, 5, fill, default");

		AERMMDSDType_desc = new JLabel("Model index");
		aerModelMonoModalFormJp.add(AERMMDSDType_desc, "9, 5");

		AERMMDLNDradius_title = new JLabel("AER.MMD.LNDradius *:");
		aerModelMonoModalFormJp.add(AERMMDLNDradius_title, "2, 7");

		AERMMDLNDradius_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERMMDLNDradius_title, AERMMDLNDradius_spinner);
		AERMMDLNDradius_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERMMDLNDradius();
                validateForm();
            }
        });
		aerModelMonoModalFormJp.add(AERMMDLNDradius_spinner, "4, 7");

		AERMMDLNDradius_desc = new JLabel(
				"Modal radius (microns) of the Log-Normal size distribution");
		aerModelMonoModalFormJp.add(AERMMDLNDradius_desc, "9, 7");

		AERMMDLNDvar_title = new JLabel("AER.MMD.LNDvar *:");
		aerModelMonoModalFormJp.add(AERMMDLNDvar_title, "2, 9, right, default");

		AERMMDLNDvar_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERMMDLNDvar_title, AERMMDLNDvar_spinner);
		AERMMDLNDvar_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERMMDLNDvar();
                validateForm();
            }
        });
		aerModelMonoModalFormJp.add(AERMMDLNDvar_spinner, "4, 9");

		AERMMDLNDvar_desc = new JLabel(
				"Standard deviation of the Log-Normal size distribution");
		aerModelMonoModalFormJp.add(AERMMDLNDvar_desc, "9, 9");

		AERMMDJDslope_title = new JLabel("AER.MMD.JD.slope *:");
		aerModelMonoModalFormJp.add(AERMMDJDslope_title, "2, 11, right, default");

		AERMMDJDslope_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("3.0"), new BigDecimal("3.0"), new BigDecimal("5.0"), new BigDecimal("0.1")));
        PropertiesManager.getInstance().register(AERMMDJDslope_title, AERMMDJDslope_spinner);
		AERMMDJDslope_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERMMDJDslope();
                validateForm();
            }
        });
		aerModelMonoModalFormJp.add(AERMMDJDslope_spinner, "4, 11");

		AERMMDJDslope_desc = DefaultComponentFactory
				.getInstance()
				.createLabel(
						"Slope of the Junge\u2019s law (3 is a singular value), a positive value in the range 3.0-5.0");
		AERMMDJDslope_desc.setToolTipText("Slope of the Junge\u2019s law (3 is a singular value), a positive value in the range 3.0-5.0");
		aerModelMonoModalFormJp.add(AERMMDJDslope_desc, "9, 11");

		AERMMDJDrmin_title = new JLabel("AER.MMD.JD.rmin *:");
		aerModelMonoModalFormJp.add(AERMMDJDrmin_title, "2, 13, right, default");

		panel_2 = new JPanel();
		aerModelMonoModalFormJp.add(panel_2, "4, 13, fill, fill");
		panel_2.setLayout(new BorderLayout(0, 0));

		AERMMDJDrmin_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
		panel_2.add(AERMMDJDrmin_spinner, BorderLayout.CENTER);
        PropertiesManager.getInstance().register(AERMMDJDrmin_title, AERMMDJDrmin_spinner);
		AERMMDJDrmin_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERMMDJDrmin();
				validateForm();
			}
		});

		AERMMDJDrmin_desc = new JLabel(
				"Minimal radius of the Junge\u2019s law (microns)");
		AERMMDJDrmin_desc.setToolTipText("Minimal radius of the Junge\u2019s law (microns)");
		aerModelMonoModalFormJp.add(AERMMDJDrmin_desc, "9, 13");

		AERMMDJDrmax_title = new JLabel("AER.MMD.JD.rmax *:");
		AERMMDJDrmax_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelMonoModalFormJp.add(AERMMDJDrmax_title, "2, 15");

		AERMMDJDrmax_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERMMDJDrmax_title, AERMMDJDrmax_spinner);
		AERMMDJDrmax_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERMMDJDrmax();
				validateForm();
			}
		});
		aerModelMonoModalFormJp.add(AERMMDJDrmax_spinner, "4, 15");

		AERMMDJDrmax_desc = new JLabel(
				"Maximal radius of the Junge\u2019s law (microns)");
		AERMMDJDrmax_desc.setToolTipText("Maximal radius of the Junge\u2019s law (microns)");
		aerModelMonoModalFormJp.add(AERMMDJDrmax_desc, "9, 15");

		AERMMDMRwaref_title = new JLabel("AER.MMD.MRwaref *:");
		AERMMDMRwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelMonoModalFormJp.add(AERMMDMRwaref_title, "2, 17, right, default");

		AERMMDMRwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERMMDMRwaref_title, AERMMDMRwaref_spinner);
		AERMMDMRwaref_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERMMDMRwaref();
                validateForm();
            }
        });
		aerModelMonoModalFormJp.add(AERMMDMRwaref_spinner, "4, 17");

		AERMMDMRwaref_desc = new JLabel(
				"Real part of the refractive index for the reference wavelength");
		AERMMDMRwaref_desc
				.setToolTipText("Real part of the refractive index for the reference wavelength");
		aerModelMonoModalFormJp.add(AERMMDMRwaref_desc, "9, 17");

		AERMMDMIwaref_title = new JLabel("AER.MMD.MIwaref *:");
		AERMMDMIwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelMonoModalFormJp.add(AERMMDMIwaref_title, "2, 19");

		AERMMDMIwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1), new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERMMDMIwaref_title, AERMMDMIwaref_spinner);
		AERMMDMIwaref_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERMMDMIwaref();
				validateForm();
			}
		});
		aerModelMonoModalFormJp.add(AERMMDMIwaref_spinner, "4, 19");

		AERMMDMIwaref_desc = new JLabel(
				"Imaginary part of the refractive index for the reference wavelength");
		AERMMDMIwaref_desc
				.setToolTipText("Imaginary part of the refractive index for the reference wavelength");
		aerModelMonoModalFormJp.add(AERMMDMIwaref_desc, "9, 19");

		///////////////////////////////////////////////////
		JPanel aerModelWmoMultiModalFormJp = new JPanel();
		aerModelWmoMultiModalFormJp.setBackground(Color.WHITE);
		FormLayout aerModelWmoMultiModalFormLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,});
		aerModelWmoMultiModalFormJp.setLayout( aerModelWmoMultiModalFormLayout );
		aerModelContentFormJp.add(aerModelWmoMultiModalFormJp, AerosolModelTypeEnum.WMO_MULTI_MODAL.name());
		
		AERWMOModel_title = new JLabel("AER.WMO.Model l*:");
		AERWMOModel_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelWmoMultiModalFormJp.add(AERWMOModel_title, "2, 1, right, default");

		AERWMOModel_comboBox = new JComboBox();
		AERWMOModel_comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e_) {
				JComboBox cb = (JComboBox) e_.getSource();
				int selIndex = cb.getSelectedIndex();

				onAERWMOModelSelIndexItemChanged(getAERModel(), selIndex);
				
				saveAERWMOModel();
				validateForm();
			}
		});
		AERWMOModel_comboBox.setModel(new DefaultComboBoxModel(AERWMOModelEnum
				.values()));
		aerModelWmoMultiModalFormJp.add(AERWMOModel_comboBox, "4, 1, fill, default");

		AERWMOModel_desc = new JLabel(
				"Type of WMO model ");
		aerModelWmoMultiModalFormJp.add(AERWMOModel_desc, "9, 1");

		AERWMODL_title = new JLabel("AER.WMO.DL *:");
		AERWMODL_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelWmoMultiModalFormJp.add(AERWMODL_title, "2, 3, default, top");

		AERWMODL_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.0"), new BigDecimal("0.0"), new BigDecimal("1.0"), new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERWMODL_title, AERWMODL_spinner);
		AERWMODL_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERWMODL();
				validateForm();
			}
		});
		aerModelWmoMultiModalFormJp.add(AERWMODL_spinner, "4, 3");

		AERWMODL_desc = new JLabel(
				"Volumetric concentration of  \u00AB Dust-Like \u00BB components(value between 0 and 1)");
		AERWMODL_desc
				.setToolTipText("Volumetric concentration of  \u00AB Dust-Like \u00BB components(value between 0 and 1)");
		aerModelWmoMultiModalFormJp.add(AERWMODL_desc, "9, 3");

		AERWMOWS_title = new JLabel("AER.WMO.WS *:");
		AERWMOWS_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelWmoMultiModalFormJp.add(AERWMOWS_title, "2, 5");

		AERWMOWS_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.0"), new BigDecimal("0.0"), new BigDecimal("1.0"), new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERWMOWS_title, AERWMOWS_spinner);
		AERWMOWS_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERWMOWS();
                validateForm();
            }
        });
		aerModelWmoMultiModalFormJp.add(AERWMOWS_spinner, "4, 5");

		AERWMOWS_desc = new JLabel(
				"Volumetric concentration of  \u00AB Water Soluble \u00BB components(value between 0 and 1)");
		AERWMOWS_desc
				.setToolTipText("Volumetric concentration of  \u00AB Water Soluble \u00BB components(value between 0 and 1)");
		aerModelWmoMultiModalFormJp.add(AERWMOWS_desc, "9, 5");

		AERWMOOC_title = new JLabel("AER.WMO.OC *:");
		AERWMOOC_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelWmoMultiModalFormJp.add(AERWMOOC_title, "2, 7");

		AERWMOOC_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.0"), new BigDecimal("0.0"), new BigDecimal("1.0"), new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERWMOOC_title, AERWMOOC_spinner);
		AERWMOOC_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERWMOOC();
                validateForm();
            }
        });
		aerModelWmoMultiModalFormJp.add(AERWMOOC_spinner, "4, 7");

		AERWMOOC_desc = new JLabel(
				"Volumetric concentration of  \u00AB Oceanic \u00BB components(value between 0 and 1)");
		AERWMOOC_desc
				.setToolTipText("Volumetric concentration of  \u00AB Oceanic \u00BB components(value between 0 and 1)");
		aerModelWmoMultiModalFormJp.add(AERWMOOC_desc, "9, 7");

		AERWMOSO_title = new JLabel("AER.WMO.SO *:");
		AERWMOSO_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelWmoMultiModalFormJp.add(AERWMOSO_title, "2, 9");

		AERWMOSO_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.0"), new BigDecimal("0.0"), new BigDecimal("1.0"), new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERWMOSO_title, AERWMOSO_spinner);
		AERWMOSO_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERWMOSO();
                validateForm();
            }
        });
		aerModelWmoMultiModalFormJp.add(AERWMOSO_spinner, "4, 9");

		AERWMOSO_desc = new JLabel(
				"Volumetric concentration of  \u00AB Soot \u00BB components\t(value between 0 and 1)");
		AERWMOSO_desc
				.setToolTipText("Volumetric concentration of  \u00AB Soot \u00BB components\t(value between 0 and 1)");
		aerModelWmoMultiModalFormJp.add(AERWMOSO_desc, "9, 9");

		
		//////////////////////////////////////////////////////////////////
		JPanel aerModelShettleAndFennBiModalFormJp = new JPanel();
		aerModelShettleAndFennBiModalFormJp.setBackground(Color.WHITE);
		FormLayout aerModelShettleAndFennBiModalFormLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,});
		aerModelShettleAndFennBiModalFormJp.setLayout( aerModelShettleAndFennBiModalFormLayout );
		aerModelContentFormJp.add(aerModelShettleAndFennBiModalFormJp, AerosolModelTypeEnum.SHETTLE_AND_FENN_BI_MODAL.name());

		AERSFModel_title = new JLabel("AER.SF.Model *:");
		aerModelShettleAndFennBiModalFormJp.add(AERSFModel_title, "2, 1, right, default");

		AERSFModel_comboBox = new JComboBox();
		AERSFModel_comboBox.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e_) {
				saveAERSFModel();
				validateForm();
			}
		});
		AERSFModel_comboBox.setModel(new DefaultComboBoxModel(AERSFModelEnum
				.values()));
		aerModelShettleAndFennBiModalFormJp.add(AERSFModel_comboBox, "4, 1, fill, default");

		AERSFModel_desc = new JLabel("Shettle & Fenn model");
		aerModelShettleAndFennBiModalFormJp.add(AERSFModel_desc, "9, 1");

		AERSFRH_title = new JLabel("AER.SF.RH *:");
		AERSFRH_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelShettleAndFennBiModalFormJp.add(AERSFRH_title, "2, 3");

		AERSFRH_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal(0), new BigDecimal(0), new BigDecimal(99), new BigDecimal(1)));
        PropertiesManager.getInstance().register(AERSFRH_title, AERSFRH_spinner);
		AERSFRH_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERSFRH();
				validateForm();
			}
		});
		aerModelShettleAndFennBiModalFormJp.add(AERSFRH_spinner, "4, 3");

		AERSFRH_desc = new JLabel(
				"Percentage of relative humidity (from 0 to 99%)");
		AERSFRH_desc
				.setToolTipText("Percentage of relative humidity (from 0 to 99%)");
		aerModelShettleAndFennBiModalFormJp.add(AERSFRH_desc, "9, 3");

		
		/////////////////////////////////////////////////////////
		JPanel aerModelLogNormalBiModalFormJp = new JPanel();
		aerModelLogNormalBiModalFormJp.setBackground(Color.WHITE);
		FormLayout aerModelLogNormalBiModalFormLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,});
		aerModelLogNormalBiModalFormJp.setLayout( aerModelLogNormalBiModalFormLayout );
		aerModelContentFormJp.add(aerModelLogNormalBiModalFormJp, AerosolModelTypeEnum.LOG_NORMAL_BI_MODAL.name());
		
		AERBMDVCdef_title = new JLabel("AER.BMD.VCdef *:");
		AERBMDVCdef_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDVCdef_title, "2, 1, right, default");

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		aerModelLogNormalBiModalFormJp.add(panel_1, "4, 1, fill, fill");
		panel_1.setLayout(new BoxLayout(panel_1, BoxLayout.Y_AXIS));

		AERBMDVCdef_choice1_RadioButton = new JRadioButton(
				"1 : Use of predefined volumetric concentrations");
		buttonGroup.add(AERBMDVCdef_choice1_RadioButton);
		AERBMDVCdef_choice1_RadioButton.setSelected(true);
		AERBMDVCdef_choice1_RadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				onAERBMDVCdefChoiceChanged(getAERModel(), AERBMDVCdef_choice1_RadioButton.isSelected());
				
				saveAERBMDVCdef();
				validateForm();
			}
		});
		AERBMDVCdef_choice1_RadioButton.setBackground(Color.WHITE);
		panel_1.add(AERBMDVCdef_choice1_RadioButton);

		AERBMDVCdef_choice2_RadioButton = new JRadioButton(
				"2 : Use of the ratio of optical thickness of coarse mode over total optical thickness");
		buttonGroup.add(AERBMDVCdef_choice2_RadioButton);
		AERBMDVCdef_choice2_RadioButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				onAERBMDVCdefChoiceChanged(getAERModel(), AERBMDVCdef_choice1_RadioButton.isSelected());
				
				saveAERBMDVCdef();
				validateForm();
			}
		});
		AERBMDVCdef_choice2_RadioButton.setBackground(Color.WHITE);
		panel_1.add(AERBMDVCdef_choice2_RadioButton);

		AERBMDVCdef_desc = new JLabel("Choice of mixture description type");
		AERBMDVCdef_desc.setToolTipText("Choice of mixture description type");
		aerModelLogNormalBiModalFormJp.add(AERBMDVCdef_desc, "9, 1");

		AERBMDCoarseVC_title = new JLabel("AER.BMD.CoarseVC *:");
		aerModelLogNormalBiModalFormJp.add(AERBMDCoarseVC_title, "2, 3, right, default");

		AERBMDCoarseVC_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDCoarseVC_title, AERBMDCoarseVC_spinner);
		AERBMDCoarseVC_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCoarseVC();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCoarseVC_spinner, "4, 3");

		AERBMDCoarseVC_desc = new JLabel(
				"Volumetric concentration of the coarse mode");
		aerModelLogNormalBiModalFormJp.add(AERBMDCoarseVC_desc, "9, 3");

		AERBMDFineVC_title = new JLabel("AER.BMD.FineVC *:");
		AERBMDFineVC_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFineVC_title, "2, 5");

		AERBMDFineVC_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDFineVC_title, AERBMDFineVC_spinner);
		AERBMDFineVC_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERBMDFineVC();
				validateForm();
			}
		});
		aerModelLogNormalBiModalFormJp.add(AERBMDFineVC_spinner, "4, 5");

		AERBMDFineVC_desc = new JLabel(
				"Volumetric concentration of the fine mode");
		aerModelLogNormalBiModalFormJp.add(AERBMDFineVC_desc, "9, 5");

		AERBMDRAOT_title = new JLabel("AER.BMD.RAOT *:");
		AERBMDRAOT_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDRAOT_title, "2, 7");

		AERBMDRAOT_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), new BigDecimal("1.00"), new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDRAOT_title, AERBMDRAOT_spinner);
		AERBMDRAOT_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDRAOT();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDRAOT_spinner, "4, 7");

		AERBMDRAOT_desc = new JLabel(
				"Ratio of coarse mode optical thickness over total one for the reference wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDRAOT_desc, "9, 7");
		
		labelSeparator1_AerModel3 = new JLabel("    |--> Coarse mode LND parameters");
		labelSeparator1_AerModel3.setHorizontalAlignment(SwingConstants.LEFT);
		labelSeparator1_AerModel3.setForeground(Color.BLUE);
		labelSeparator1_AerModel3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aerModelLogNormalBiModalFormJp.add(labelSeparator1_AerModel3, "2, 9, 3, 1");
		
		jseparator1_AerModel3 = new JSeparator();
		jseparator1_AerModel3.setForeground(SystemColor.inactiveCaption);
		aerModelLogNormalBiModalFormJp.add(jseparator1_AerModel3, "9, 9");

		AERBMDCMMRwa_title = new JLabel("AER.BMD.CM.MRwa *:");
		AERBMDCMMRwa_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwa_title, "2, 11");

		AERBMDCMMRwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDCMMRwa_title, AERBMDCMMRwa_spinner);
		AERBMDCMMRwa_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCMMRwa();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwa_spinner, "4, 11");

		AERBMDCMMRwa_desc = new JLabel(
				"Real part of the refractive index at simulation wavelength");
		AERBMDCMMRwa_desc
				.setToolTipText("Real part of the refractive index at simulation wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwa_desc, "9, 11");

		AERBMDCMMIwa_title = new JLabel("AER.BMD.CM.MIwa *:");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwa_title, "2, 13, right, default");

		AERBMDCMMIwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1), new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDCMMIwa_title, AERBMDCMMIwa_spinner);
		AERBMDCMMIwa_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCMMIwa();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwa_spinner, "4, 13");

		AERBMDCMMIwa_desc = new JLabel(
				"Imaginary part of the refractive index at simulation wavelength");
		AERBMDCMMIwa_desc
				.setToolTipText("Imaginary part of the refractive index at simulation wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwa_desc, "9, 13");

		AERBMDCMSDradius_title = new JLabel("AER.BMD.CM.SDradius *:");
		AERBMDCMSDradius_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDradius_title, "2, 15");

		AERBMDCMSDradius_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDCMSDradius_title, AERBMDCMSDradius_spinner);
		AERBMDCMSDradius_spinner.addChangeListener(new ChangeListener() {
			public void stateChanged(ChangeEvent e) {
				saveAERBMDCMSDradius();
				validateForm();
			}
		});
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDradius_spinner, "4, 15");

		AERBMDCMSDradius_desc = new JLabel(
				"Modal radius of LND size distribution (\u00B5m)");
		AERBMDCMSDradius_desc
				.setToolTipText("Modal radius of LND size distribution (\u00B5m)");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDradius_desc, "9, 15");

		AERBMDCMSDvar_title = new JLabel("AER.BMD.CM.SDvar *:");
		AERBMDCMSDvar_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDvar_title, "2, 17");

		AERBMDCMSDvar_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDCMSDvar_title, AERBMDCMSDvar_spinner);
		AERBMDCMSDvar_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCMSDvar();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDvar_spinner, "4, 17");

		AERBMDCMSDvar_desc = new JLabel(
				"Standard deviation of LND size distribution");
		AERBMDCMSDvar_desc
				.setToolTipText("Standard deviation of LND size distribution");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMSDvar_desc, "9, 17");

		AERBMDCMMRwaref_title = new JLabel("AER.BMD.CM.MRwaref *:");
		AERBMDCMMRwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwaref_title, "2, 19");

		AERBMDCMMRwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDCMMRwaref_title, AERBMDCMMRwaref_spinner);
		AERBMDCMMRwaref_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCMMRwaref();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwaref_spinner, "4, 19");

		AERBMDCMMRwaref_desc = new JLabel(
				"Real part of the refractive index at reference wavelength");
		AERBMDCMMRwaref_desc
				.setToolTipText("Real part of the refractive index at reference wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMRwaref_desc, "9, 19");

		AERBMDCMMIwaref_title = new JLabel("AER.BMD.CM.MIwaref *:");
		AERBMDCMMIwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwaref_title, "2, 21");

		AERBMDCMMIwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1), new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDCMMIwaref_title, AERBMDCMMIwaref_spinner);
		AERBMDCMMIwaref_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDCMMIwaref();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwaref_spinner, "4, 21");

		AERBMDCMMIwaref_desc = new JLabel(
				"Imaginary part of the refractive index at reference wavelength");
		AERBMDCMMIwaref_desc
				.setToolTipText("Imaginary part of the refractive index at reference wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDCMMIwaref_desc, "9, 21");

		labelSeparator2_AerModel3 = new JLabel("    |--> Fine mode LND parameters");
		labelSeparator2_AerModel3.setHorizontalAlignment(SwingConstants.LEFT);
		labelSeparator2_AerModel3.setForeground(Color.BLUE);
		labelSeparator2_AerModel3.setFont(new Font("Tahoma", Font.PLAIN, 11));
		aerModelLogNormalBiModalFormJp.add(labelSeparator2_AerModel3, "2, 23, 3, 1");
		
		jseparator2_AerModel3 = new JSeparator();
		jseparator2_AerModel3.setForeground(SystemColor.inactiveCaption);
		aerModelLogNormalBiModalFormJp.add(jseparator2_AerModel3, "9, 23");

		AERBMDFMMRwa_title = new JLabel("AER.BMD.FM.MRwa *:");
		AERBMDFMMRwa_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwa_title, "2, 25");

		AERBMDFMMRwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDFMMRwa_title, AERBMDFMMRwa_spinner);
		AERBMDFMMRwa_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMMRwa();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwa_spinner, "4, 25");

		AERBMDFMMRwa_desc = new JLabel(
				"Real part of the refractive index at simulation wavelength");
		AERBMDFMMRwa_desc
				.setToolTipText("Real part of the refractive index at simulation wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwa_desc, "9, 25");

		AERBMDFMMIwa_title = new JLabel("AER.BMD.FM.MIwa *:");
		AERBMDFMMIwa_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwa_title, "2, 27");

		AERBMDFMMIwa_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1), new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDFMMIwa_title, AERBMDFMMIwa_spinner);
		AERBMDFMMIwa_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMMIwa();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwa_spinner, "4, 27");

		AERBMDFMMIwa_desc = new JLabel(
				"Imaginary part of the refractive index at simulation wavelength");
		AERBMDFMMIwa_desc
				.setToolTipText("Imaginary part of the refractive index at simulation wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwa_desc, "9, 27");

		AERBMDFMSDradius_title = new JLabel("AER.BMD.FM.SDradius *:");
		AERBMDFMSDradius_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDradius_title, "2, 29");

		AERBMDFMSDradius_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDFMSDradius_title, AERBMDFMSDradius_spinner);
		AERBMDFMSDradius_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMSDradius();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDradius_spinner, "4, 29");

		AERBMDFMSDradius_desc = new JLabel(
				"Modal radius of LND size distribution (\u00B5m)");
		AERBMDFMSDradius_desc
				.setToolTipText("Modal radius of LND size distribution (\u00B5m)");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDradius_desc, "9, 29");

		AERBMDFMSDvar_title = new JLabel("AER.BMD.FM.SDvar *:");
		AERBMDFMSDvar_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDvar_title, "2, 31");

		AERBMDFMSDvar_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.00"), new BigDecimal("0.00"), null, new BigDecimal("0.01")));
        PropertiesManager.getInstance().register(AERBMDFMSDvar_title, AERBMDFMSDvar_spinner);
		AERBMDFMSDvar_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMSDvar();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDvar_spinner, "4, 31");

		AERBMDFMSDvar_desc = new JLabel(
				"Standard deviation of LND size distribution ");
		AERBMDFMSDvar_desc
				.setToolTipText("Standard deviation of LND size distribution ");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMSDvar_desc, "9, 31");

		AERBMDFMMRwaref_title = new JLabel("AER.BMD.FM.MRwaref *:");
		AERBMDFMMRwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwaref_title, "2, 33");

		AERBMDFMMRwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal("0.000"), null, new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDFMMRwaref_title, AERBMDFMMRwaref_spinner);
		AERBMDFMMRwaref_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMMRwaref();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwaref_spinner, "4, 33");

		AERBMDFMMRwaref_desc = new JLabel(
				"Real part of the refractive index at reference wavelength");
		AERBMDFMMRwaref_desc
				.setToolTipText("Real part of the refractive index at reference wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMRwaref_desc, "9, 33");

		AERBMDFMMIwaref_title = new JLabel("AER.BMD.FM.MIwaref *:");
		AERBMDFMMIwaref_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwaref_title, "2, 35");

		AERBMDFMMIwaref_spinner = new JSpinnerRangedValue(new SpinnerBigDecimalModel(new BigDecimal("0.000"), new BigDecimal(-1), new BigDecimal("0.000"), new BigDecimal("0.001")));
        PropertiesManager.getInstance().register(AERBMDFMMIwaref_title, AERBMDFMMIwaref_spinner);
		AERBMDFMMIwaref_spinner.addChangeListener(new ChangeListener() {
            public void stateChanged(ChangeEvent e) {
                saveAERBMDFMMIwaref();
                validateForm();
            }
        });
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwaref_spinner, "4, 35");

		AERBMDFMMIwaref_desc = new JLabel(
				"Imaginary part of the refractive index at reference wavelength");
		AERBMDFMMIwaref_desc
				.setToolTipText("Imaginary part of the refractive index at reference wavelength");
		aerModelLogNormalBiModalFormJp.add(AERBMDFMMIwaref_desc, "9, 35");

		/////////////////////////////////////////
		JPanel aerModelPhaseFctFromAnExternalSrcFormJp = new JPanel();
		aerModelPhaseFctFromAnExternalSrcFormJp.setBackground(Color.WHITE);
		FormLayout aerModelPhaseFctFromAnExternalSrcFormLayout = new FormLayout(new ColumnSpec[] {
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(67dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(145dlu;default)"),
				FormFactory.RELATED_GAP_COLSPEC,
				FormFactory.DEFAULT_COLSPEC,
				FormFactory.RELATED_GAP_COLSPEC,
				ColumnSpec.decode("max(4dlu;default)"),
				ColumnSpec.decode("default:grow"),},
			new RowSpec[] {
				FormFactory.DEFAULT_ROWSPEC,
				FormFactory.RELATED_GAP_ROWSPEC,});
		aerModelPhaseFctFromAnExternalSrcFormJp.setLayout( aerModelPhaseFctFromAnExternalSrcFormLayout );
		aerModelContentFormJp.add(aerModelPhaseFctFromAnExternalSrcFormJp, AerosolModelTypeEnum.PHASE_FUNCTIONS_FROM_AN_EXTERNAL_SOURCE.name());
		
		AERExtData_title = new JLabel("AER.ExtData *:");
		AERExtData_title.setHorizontalAlignment(SwingConstants.RIGHT);
		aerModelPhaseFctFromAnExternalSrcFormJp.add(AERExtData_title, "2, 1");

		AERExtData_textField = new JTextField();
		AERExtData_textField.addCaretListener(new CaretListener() {
			public void caretUpdate(CaretEvent e) {
				saveAERExtData();
				validateForm();
			}
		});
		aerModelPhaseFctFromAnExternalSrcFormJp.add(AERExtData_textField, "4, 1");

		AERExtData_desc = new JLabel(
				"Filename of external phase function data (full path)");
		AERExtData_desc
				.setToolTipText("Filename of external phase function data (full path)");
		aerModelPhaseFctFromAnExternalSrcFormJp.add(AERExtData_desc, "9, 1");
		
		
		
		
		getFormFieldsPanel().add(aerModelContentFormJp);
	}

	protected void onAERModelItemChanged(int selIndex) {
		CardLayout cl = (CardLayout)(aerModelContentFormJp.getLayout());
		cl.show(aerModelContentFormJp, AerosolModelTypeEnum.values()[selIndex].name());
		
		// ### If AER.Model = 0 : parameters of mono-modal size
		// distributions
		setAERMMDMRwaVisible(selIndex == 0);
		setAERMMDMIwaVisible(selIndex == 0);
		setAERMMDSDtypeVisible(selIndex == 0);

		int sdTypeSelIndex = getAERMMDSDtype();
		onAERMMDSDTypeItemChanged(selIndex, sdTypeSelIndex);
		
		boolean isAERWaref_diferent_OSOAAWa = atmosphericAndSeaProfiles
				.getAERWaref().doubleValue() != commonPreferences
				.getRadianceWaveLength().doubleValue();
		setAERMMDMRwarefVisible(selIndex == 0
				&& isAERWaref_diferent_OSOAAWa);
		setAERMMDMIwarefVisible(selIndex == 0
				&& isAERWaref_diferent_OSOAAWa);

		// ### If AER.Model = 1 : WMO model
		setAERWMOModelVisible(selIndex == 1);

		int AERWMOModelSelIndex = getAERWMOModel();
		onAERWMOModelSelIndexItemChanged(selIndex, AERWMOModelSelIndex);
		
		// ### If AER.Model = 2 : Shettle & Fenn
		setAERSFModelVisible(selIndex == 2);
		setAERSFRHVisible(selIndex == 2);

		// ### If AER.Model = 3 :bi-modal LND
		jseparator1_AerModel3.setVisible(selIndex == 3);
		labelSeparator1_AerModel3.setVisible(selIndex == 3);
		
		jseparator2_AerModel3.setVisible(selIndex == 3);
		labelSeparator2_AerModel3.setVisible(selIndex == 3);
		
		setAERBMDVCdefVisible(selIndex == 3);

		boolean isAERBMDVCdefChoice0Selected = AERBMDVCdef_choice1_RadioButton.isSelected();
		onAERBMDVCdefChoiceChanged(selIndex, isAERBMDVCdefChoice0Selected);
		
		setAERBMDCMMRwaVisible(selIndex == 3);
		setAERBMDCMMIwaVisible(selIndex == 3);
		setAERBMDCMSDradiusVisible(selIndex == 3);
		setAERBMDCMSDvarVisible(selIndex == 3);
		setAERBMDCMMRwarefVisible(selIndex == 3 && isAERWaref_diferent_OSOAAWa);
		setAERBMDCMMIwarefVisible(selIndex == 3 && isAERWaref_diferent_OSOAAWa);

		setAERBMDFMMRwaVisible(selIndex == 3);
		setAERBMDFMMIwaVisible(selIndex == 3);
		setAERBMDFMSDradiusVisible(selIndex == 3);
		setAERBMDFMSDvarVisible(selIndex == 3);
		setAERBMDFMMRwarefVisible(selIndex == 3 && isAERWaref_diferent_OSOAAWa);
		setAERBMDFMMIwarefVisible(selIndex == 3 && isAERWaref_diferent_OSOAAWa);

		// ### If AER.Model = 4 : phase functions from an external
		// source
		setAERExtDataVisible(selIndex == 4);
	}

	private void onAERBMDVCdefChoiceChanged(int selIndex,
			boolean isAERBMDVCdefChoice0Selected) {
		setAERBMDCoarseVCVisible(selIndex == 3
				&& isAERBMDVCdefChoice0Selected);
		setAERBMDFineVCVisible(selIndex == 3
				&& isAERBMDVCdefChoice0Selected);

		setAERBMDRAOTVisible(selIndex == 3
				&& !isAERBMDVCdefChoice0Selected);
	}

	private void onAERWMOModelSelIndexItemChanged(int AERModelSelIndex,
			int AERWMOModelSelIndex) {
		setAERWMODLVisible(AERModelSelIndex == 1 && AERWMOModelSelIndex == 3);
		setAERWMOWSVisible(AERModelSelIndex == 1 && AERWMOModelSelIndex == 3);
		setAERWMOOCVisible(AERModelSelIndex == 1 && AERWMOModelSelIndex == 3);
		setAERWMOSOVisible(AERModelSelIndex == 1 && AERWMOModelSelIndex == 3);
	}

	private void onAERMMDSDTypeItemChanged(int AERModelSelIndex, int sdTypeSelIndex) {
		// #AER.MMD.SDtype ==1
		setAERMMDLNDradiusVisible(AERModelSelIndex == 0 && sdTypeSelIndex == 0);
		setAERMMDLNDvarVisible(AERModelSelIndex == 0 && sdTypeSelIndex == 0);

		// #AER.MMD.SDtype ==2
		setAERMMDJDslopeVisible(AERModelSelIndex == 0 && sdTypeSelIndex == 1);
		setAERMMDJDrminVisible(AERModelSelIndex == 0 && sdTypeSelIndex == 1);
		setAERMMDJDrmaxVisible(AERModelSelIndex == 0 && sdTypeSelIndex == 1);
	}

	public String getAERResFile() {
		AERResFile_txtField.validate();
		return AERResFile_txtField.getText();
	}

	private void saveAERResFile() {
		if (getAERResFile() != null) {
			aerosolsModel.setAERResFile(getAERResFile());
		}
	}

	public String getAERDirMie() {
		AERDirMie_textField.validate();
		return AERDirMie_textField.getText();
	}

	private void saveAERDirMie() {
		if (getAERDirMie() != null) {
			aerosolsModel.setAERDirMie(getAERDirMie());
		}
	}

	public String getAERMieLog() {
		AERMieLog_textField.validate();
		return AERMieLog_textField.getText();
	}

	private void saveAERMieLog() {
		if (getAERMieLog() != null) {
			aerosolsModel.setAERMieLog(getAERMieLog());
		}
	}

	public String getAERLog() {
		AERLog_textField.validate();
		return AERLog_textField.getText();
	}

	private void saveAERLog() {
		if (getAERLog() != null) {
			aerosolsModel.setAERLog(getAERLog());
		}
	}

	public Boolean getAERTronca() {
		AERTronca_checkbox.validate();
		return (Boolean) AERTronca_checkbox.isSelected();
	}

	private void saveAERTronca() {
		if (getAERTronca() != null) {
			aerosolsModel.setAERTronca(getAERTronca());
		}
	}

	public Integer getAERModel() {
		AERModel_combobox.validate();
		return AERModel_combobox.getSelectedIndex();
	}

	private void saveAERModel() {
		if (getAERModel() != null) {
			aerosolsModel.setAERModel(getAERModel());
		}
	}

	public BigDecimal getAERMMDMRwa() {
		AERMMDMRwa_spinner.validate();
		return (BigDecimal) AERMMDMRwa_spinner.getValue();
	}

	private void saveAERMMDMRwa() {
		if (getAERMMDMRwa() != null) {
			aerosolsModel.setAERMMDMRwa(getAERMMDMRwa());
		}
	}

	public BigDecimal getAERMMDMIwa() {
		AERMMDMIwa_spinner.validate();
		return (BigDecimal) AERMMDMIwa_spinner.getValue();
	}

	private void saveAERMMDMIwa() {
		if (getAERMMDMIwa() != null) {
			aerosolsModel.setAERMMDMIwa(getAERMMDMIwa());
		}
	}

	public Integer getAERMMDSDtype() {
		AERMMDSDType_combo.validate();
		return AERMMDSDType_combo.getSelectedIndex();
	}

	private void saveAERMMDSDtype() {
		if (getAERMMDSDtype() != null) {
			aerosolsModel.setAERMMDSDtype(getAERMMDSDtype()+1);
		}
	}

	public BigDecimal getAERMMDLNDradius() {
		AERMMDLNDradius_spinner.validate();
		return (BigDecimal) AERMMDLNDradius_spinner.getValue();
	}

	private void saveAERMMDLNDradius() {
		if (getAERMMDLNDradius() != null) {
			aerosolsModel.setAERMMDLNDradius(getAERMMDLNDradius());
		}
	}

	public BigDecimal getAERMMDLNDvar() {
		AERMMDLNDvar_spinner.validate();
		return (BigDecimal) AERMMDLNDvar_spinner.getValue();
	}

	private void saveAERMMDLNDvar() {
		if (getAERMMDLNDvar() != null) {
			aerosolsModel.setAERMMDLNDvar(getAERMMDLNDvar());
		}
	}

	public BigDecimal getAERMMDJDslope() {
		AERMMDJDslope_spinner.validate();
		return (BigDecimal) AERMMDJDslope_spinner.getValue();
	}

	private void saveAERMMDJDslope() {
		if (getAERMMDJDslope() != null) {
			aerosolsModel.setAERMMDJDslope(getAERMMDJDslope());
		}
	}

	public BigDecimal getAERMMDJDrmin() {
		AERMMDJDrmin_spinner.validate();
		return (BigDecimal) AERMMDJDrmin_spinner.getValue();
	}

	private void saveAERMMDJDrmin() {
		if (getAERMMDJDrmin() != null) {
			aerosolsModel.setAERMMDJDrmin(getAERMMDJDrmin());
		}
	}

	public BigDecimal getAERMMDJDrmax() {
		AERMMDJDrmax_spinner.validate();
		return (BigDecimal) AERMMDJDrmax_spinner.getValue();
	}

	private void saveAERMMDJDrmax() {
		if (getAERMMDJDrmax() != null) {
			aerosolsModel.setAERMMDJDrmax(getAERMMDJDrmax());
		}
	}

	public BigDecimal getAERMMDMRwaref() {
		AERMMDMRwaref_spinner.validate();
		return (BigDecimal) AERMMDMRwaref_spinner.getValue();
	}

	private void saveAERMMDMRwaref() {
		if (getAERMMDMRwaref() != null) {
			aerosolsModel.setAERMMDMRwaref(getAERMMDMRwaref());
		}
	}

	public BigDecimal getAERMMDMIwaref() {
		AERMMDMIwaref_spinner.validate();
		return (BigDecimal) AERMMDMIwaref_spinner.getValue();
	}

	private void saveAERMMDMIwaref() {
		if (getAERMMDMIwaref() != null) {
			aerosolsModel.setAERMMDMIwaref(getAERMMDMIwaref());
		}
	}

	public Integer getAERWMOModel() {
		AERWMOModel_comboBox.validate();
		return AERWMOModel_comboBox.getSelectedIndex();
	}

	private void saveAERWMOModel() {
		if (getAERWMOModel() != null) {
			aerosolsModel.setAERWMOModel(getAERWMOModel()+1);
		}
	}

	public BigDecimal getAERWMODL() {
		AERWMODL_spinner.validate();
		return (BigDecimal) AERWMODL_spinner.getValue();
	}

	private void saveAERWMODL() {
		if (getAERWMODL() != null) {
			aerosolsModel.setAERWMODL(getAERWMODL());
		}
	}

	public BigDecimal getAERWMOWS() {
		AERWMOWS_spinner.validate();
		return (BigDecimal) AERWMOWS_spinner.getValue();
	}

	private void saveAERWMOWS() {
		if (getAERWMOWS() != null) {
			aerosolsModel.setAERWMOWS(getAERWMOWS());
		}
	}

	public BigDecimal getAERWMOOC() {
		AERWMOOC_spinner.validate();
		return (BigDecimal) AERWMOOC_spinner.getValue();
	}

	private void saveAERWMOOC() {
		if (getAERWMOOC() != null) {
			aerosolsModel.setAERWMOOC(getAERWMOOC());
		}
	}

	public BigDecimal getAERWMOSO() {
		AERWMOSO_spinner.validate();
		return (BigDecimal) AERWMOSO_spinner.getValue();
	}

	private void saveAERWMOSO() {
		if (getAERWMOSO() != null) {
			aerosolsModel.setAERWMOSO(getAERWMOSO());
		}
	}

	public Integer getAERSFModel() {
		AERSFModel_comboBox.validate();
		return AERSFModel_comboBox.getSelectedIndex()+1;
	}

	private void saveAERSFModel() {
		if (getAERSFModel() != null) {
			aerosolsModel.setAERSFModel(getAERSFModel());
		}
	}

	public BigDecimal getAERSFRH() {
		AERSFRH_spinner.validate();
		return (BigDecimal) AERSFRH_spinner.getValue();
	}

	private void saveAERSFRH() {
		if (getAERSFRH() != null) {
			aerosolsModel.setAERSFRH(getAERSFRH());
		}
	}

	public Boolean getAERBMDVCdef() {
		AERBMDVCdef_choice1_RadioButton.validate();
		return AERBMDVCdef_choice1_RadioButton.isSelected();
	}

	private void saveAERBMDVCdef() {
		if (getAERBMDVCdef() != null) {
            boolean selected = getAERBMDVCdef();
            if(selected)
            {
                aerosolsModel.setAERBMDVCdef(1);
            }
            else
            {
                aerosolsModel.setAERBMDVCdef(2);
            }
		}
	}

	public BigDecimal getAERBMDCoarseVC() {
		AERBMDCoarseVC_spinner.validate();
		return (BigDecimal) AERBMDCoarseVC_spinner.getValue();
	}

	private void saveAERBMDCoarseVC() {
		if (getAERBMDCoarseVC() != null) {
			aerosolsModel.setAERBMDCoarseVC(getAERBMDCoarseVC());
		}
	}

	public BigDecimal getAERBMDFineVC() {
		AERBMDFineVC_spinner.validate();
		return (BigDecimal) AERBMDFineVC_spinner.getValue();
	}

	private void saveAERBMDFineVC() {
		if (getAERBMDFineVC() != null) {
			aerosolsModel.setAERBMDFineVC(getAERBMDFineVC());
		}
	}

	public BigDecimal getAERBMDRAOT() {
		AERBMDRAOT_spinner.validate();
		return (BigDecimal) AERBMDRAOT_spinner.getValue();
	}

	private void saveAERBMDRAOT() {
		if (getAERBMDRAOT() != null) {
			aerosolsModel.setAERBMDRAOT(getAERBMDRAOT());
		}
	}

	public BigDecimal getAERBMDCMMRwa() {
		AERBMDCMMRwa_spinner.validate();
		return (BigDecimal) AERBMDCMMRwa_spinner.getValue();
	}

	private void saveAERBMDCMMRwa() {
		if (getAERBMDCMMRwa() != null) {
			aerosolsModel.setAERBMDCMMRwa(getAERBMDCMMRwa());
		}
	}

	public BigDecimal getAERBMDCMMIwa() {
		AERBMDCMMIwa_spinner.validate();
		return (BigDecimal) AERBMDCMMIwa_spinner.getValue();
	}

	private void saveAERBMDCMMIwa() {
		if (getAERBMDCMMIwa() != null) {
			aerosolsModel.setAERBMDCMMIwa(getAERBMDCMMIwa());
		}
	}

	public BigDecimal getAERBMDCMSDradius() {
		AERBMDCMSDradius_spinner.validate();
		return (BigDecimal) AERBMDCMSDradius_spinner.getValue();
	}

	private void saveAERBMDCMSDradius() {
		if (getAERBMDCMSDradius() != null) {
			aerosolsModel.setAERBMDCMSDradius(getAERBMDCMSDradius());
		}
	}

	public BigDecimal getAERBMDCMSDvar() {
		AERBMDCMSDvar_spinner.validate();
		return (BigDecimal) AERBMDCMSDvar_spinner.getValue();
	}

	private void saveAERBMDCMSDvar() {
		if (getAERBMDCMSDvar() != null) {
			aerosolsModel.setAERBMDCMSDvar(getAERBMDCMSDvar());
		}
	}

	public BigDecimal getAERBMDCMMRwaref() {
		AERBMDCMMRwaref_spinner.validate();
		return (BigDecimal) AERBMDCMMRwaref_spinner.getValue();
	}

	private void saveAERBMDCMMRwaref() {
		if (getAERBMDCMMRwaref() != null) {
			aerosolsModel.setAERBMDCMMRwaref(getAERBMDCMMRwaref());
		}
	}

	public BigDecimal getAERBMDCMMIwaref() {
		AERBMDCMMIwaref_spinner.validate();
		return (BigDecimal) AERBMDCMMIwaref_spinner.getValue();
	}

	private void saveAERBMDCMMIwaref() {
		if (getAERBMDCMMIwaref() != null) {
			aerosolsModel.setAERBMDCMMIwaref(getAERBMDCMMIwaref());
		}
	}

	public BigDecimal getAERBMDFMMRwa() {
		AERBMDFMMRwa_spinner.validate();
		return (BigDecimal) AERBMDFMMRwa_spinner.getValue();
	}

	private void saveAERBMDFMMRwa() {
		if (getAERBMDFMMRwa() != null) {
			aerosolsModel.setAERBMDFMMRwa(getAERBMDFMMRwa());
		}
	}

	public BigDecimal getAERBMDFMMIwa() {
		AERBMDFMMIwa_spinner.validate();
		return (BigDecimal) AERBMDFMMIwa_spinner.getValue();
	}

	private void saveAERBMDFMMIwa() {
		if (getAERBMDFMMIwa() != null) {
			aerosolsModel.setAERBMDFMMIwa(getAERBMDFMMIwa());
		}
	}

	public BigDecimal getAERBMDFMSDradius() {
		AERBMDFMSDradius_spinner.validate();
		return (BigDecimal) AERBMDFMSDradius_spinner.getValue();
	}

	private void saveAERBMDFMSDradius() {
		if (getAERBMDFMSDradius() != null) {
			aerosolsModel.setAERBMDFMSDradius(getAERBMDFMSDradius());
		}
	}

	public BigDecimal getAERBMDFMSDvar() {
		AERBMDFMSDvar_spinner.validate();
		return (BigDecimal) AERBMDFMSDvar_spinner.getValue();
	}

	private void saveAERBMDFMSDvar() {
		if (getAERBMDFMSDvar() != null) {
			aerosolsModel.setAERBMDFMSDvar(getAERBMDFMSDvar());
		}
	}

	public BigDecimal getAERBMDFMMRwaref() {
		AERBMDFMMRwaref_spinner.validate();
		return (BigDecimal) AERBMDFMMRwaref_spinner.getValue();
	}

	private void saveAERBMDFMMRwaref() {
		if (getAERBMDFMMRwaref() != null) {
			aerosolsModel.setAERBMDFMMRwaref(getAERBMDFMMRwaref());
		}
	}

	public BigDecimal getAERBMDFMMIwaref() {
		AERBMDFMMIwaref_spinner.validate();
		return (BigDecimal) AERBMDFMMIwaref_spinner.getValue();
	}

	private void saveAERBMDFMMIwaref() {
		if (getAERBMDFMMIwaref() != null) {
			aerosolsModel.setAERBMDFMMIwaref(getAERBMDFMMIwaref());
		}
	}

	public String getAERExtData() {
		AERExtData_textField.validate();
		return AERExtData_textField.getText();
	}

	private void saveAERExtData() {
		if (getAERExtData() != null) {
			aerosolsModel.setAERExtData(getAERExtData());
		}
	}

	protected void setAERWMODLVisible(boolean isVisible_) {
		AERWMODL_title.setVisible(isVisible_);
		AERWMODL_spinner.setVisible(isVisible_);
		AERWMODL_desc.setVisible(isVisible_);
	}

	protected void setAERMMDJDrmaxVisible(boolean isVisible_) {
		AERMMDJDrmax_title.setVisible(isVisible_);
		AERMMDJDrmax_spinner.setVisible(isVisible_);
		AERMMDJDrmax_desc.setVisible(isVisible_);
	}

	protected void setAERExtDataVisible(boolean isVisible_) {
		AERExtData_title.setVisible(isVisible_);
		AERExtData_textField.setVisible(isVisible_);
		AERExtData_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMMIwarefVisible(boolean isVisible_) {
		AERBMDFMMIwaref_title.setVisible(isVisible_);
		AERBMDFMMIwaref_spinner.setVisible(isVisible_);
		AERBMDFMMIwaref_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMMRwarefVisible(boolean isVisible_) {
		AERBMDFMMRwaref_title.setVisible(isVisible_);
		AERBMDFMMRwaref_spinner.setVisible(isVisible_);
		AERBMDFMMRwaref_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMSDvarVisible(boolean isVisible_) {
		AERBMDFMSDvar_title.setVisible(isVisible_);
		AERBMDFMSDvar_spinner.setVisible(isVisible_);
		AERBMDFMSDvar_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMSDradiusVisible(boolean isVisible_) {
		AERBMDFMSDradius_title.setVisible(isVisible_);
		AERBMDFMSDradius_spinner.setVisible(isVisible_);
		AERBMDFMSDradius_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMMIwaVisible(boolean isVisible_) {
		AERBMDFMMIwa_title.setVisible(isVisible_);
		AERBMDFMMIwa_spinner.setVisible(isVisible_);
		AERBMDFMMIwa_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFMMRwaVisible(boolean isVisible_) {
		AERBMDFMMRwa_title.setVisible(isVisible_);
		AERBMDFMMRwa_spinner.setVisible(isVisible_);
		AERBMDFMMRwa_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMSDvarVisible(boolean isVisible_) {
		AERBMDCMSDvar_title.setVisible(isVisible_);
		AERBMDCMSDvar_spinner.setVisible(isVisible_);
		AERBMDCMSDvar_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMMRwarefVisible(boolean isVisible_) {
		AERBMDCMMRwaref_title.setVisible(isVisible_);
		AERBMDCMMRwaref_spinner.setVisible(isVisible_);
		AERBMDCMMRwaref_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMSDradiusVisible(boolean isVisible_) {
		AERBMDCMSDradius_title.setVisible(isVisible_);
		AERBMDCMSDradius_spinner.setVisible(isVisible_);
		AERBMDCMSDradius_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMMIwarefVisible(boolean isVisible_) {
		AERBMDCMMIwaref_title.setVisible(isVisible_);
		AERBMDCMMIwaref_spinner.setVisible(isVisible_);
		AERBMDCMMIwaref_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMMIwaVisible(boolean isVisible_) {
		AERBMDCMMIwa_title.setVisible(isVisible_);
		AERBMDCMMIwa_spinner.setVisible(isVisible_);
		AERBMDCMMIwa_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCMMRwaVisible(boolean isVisible_) {
		AERBMDCMMRwa_title.setVisible(isVisible_);
		AERBMDCMMRwa_spinner.setVisible(isVisible_);
		AERBMDCMMRwa_desc.setVisible(isVisible_);
	}

	protected void setAERBMDRAOTVisible(boolean isVisible_) {
		AERBMDRAOT_title.setVisible(isVisible_);
		AERBMDRAOT_spinner.setVisible(isVisible_);
		AERBMDRAOT_desc.setVisible(isVisible_);
	}

	protected void setAERBMDFineVCVisible(boolean isVisible_) {
		AERBMDFineVC_title.setVisible(isVisible_);
		AERBMDFineVC_spinner.setVisible(isVisible_);
		AERBMDFineVC_desc.setVisible(isVisible_);
	}

	protected void setAERBMDCoarseVCVisible(boolean isVisible_) {
		AERBMDCoarseVC_title.setVisible(isVisible_);
		AERBMDCoarseVC_spinner.setVisible(isVisible_);
		AERBMDCoarseVC_desc.setVisible(isVisible_);
	}

	protected void setAERBMDVCdefVisible(boolean isVisible_) {
		AERBMDVCdef_title.setVisible(isVisible_);
		AERBMDVCdef_choice1_RadioButton.setVisible(isVisible_);
		AERBMDVCdef_choice2_RadioButton.setVisible(isVisible_);
		AERBMDVCdef_desc.setVisible(isVisible_);
	}

	protected void setAERSFRHVisible(boolean isVisible_) {
		AERSFRH_title.setVisible(isVisible_);
		AERSFRH_spinner.setVisible(isVisible_);
		AERSFRH_desc.setVisible(isVisible_);
	}

	protected void setAERSFModelVisible(boolean isVisible_) {
		AERSFModel_title.setVisible(isVisible_);
		AERSFModel_comboBox.setVisible(isVisible_);
		AERSFModel_desc.setVisible(isVisible_);
	}

	protected void setAERWMOSOVisible(boolean isVisible_) {
		AERWMOSO_title.setVisible(isVisible_);
		AERWMOSO_spinner.setVisible(isVisible_);
		AERWMOSO_desc.setVisible(isVisible_);
	}

	protected void setAERWMOOCVisible(boolean isVisible_) {
		AERWMOOC_title.setVisible(isVisible_);
		AERWMOOC_spinner.setVisible(isVisible_);
		AERWMOOC_desc.setVisible(isVisible_);
	}

	protected void setAERWMOWSVisible(boolean isVisible_) {
		AERWMOWS_title.setVisible(isVisible_);
		AERWMOWS_spinner.setVisible(isVisible_);
		AERWMOWS_desc.setVisible(isVisible_);
	}

	protected void setAERWMOModelVisible(boolean isVisible_) {
		AERWMOModel_title.setVisible(isVisible_);
		AERWMOModel_comboBox.setVisible(isVisible_);
		AERWMOModel_desc.setVisible(isVisible_);
	}

	protected void setAERMMDMIwarefVisible(boolean isVisible_) {
		AERMMDMIwaref_title.setVisible(isVisible_);
		AERMMDMIwaref_spinner.setVisible(isVisible_);
		AERMMDMIwaref_desc.setVisible(isVisible_);
	}

	protected void setAERMMDMRwarefVisible(boolean isVisible_) {
		AERMMDMRwaref_title.setVisible(isVisible_);
		AERMMDMRwaref_spinner.setVisible(isVisible_);
		AERMMDMRwaref_desc.setVisible(isVisible_);
	}

	protected void setAERMMDJDrminVisible(boolean isVisible_) {
		AERMMDJDrmin_title.setVisible(isVisible_);
		AERMMDJDrmin_spinner.setVisible(isVisible_);
		AERMMDJDrmin_desc.setVisible(isVisible_);
	}

	protected void setAERMMDJDslopeVisible(boolean isVisible_) {
		AERMMDJDslope_title.setVisible(isVisible_);
		AERMMDJDslope_spinner.setVisible(isVisible_);
		AERMMDJDslope_desc.setVisible(isVisible_);
	}

	protected void setAERMMDLNDvarVisible(boolean isVisible_) {
		AERMMDLNDvar_title.setVisible(isVisible_);
		AERMMDLNDvar_spinner.setVisible(isVisible_);
		AERMMDLNDvar_desc.setVisible(isVisible_);
	}

	protected void setAERMMDLNDradiusVisible(boolean isVisible_) {
		AERMMDLNDradius_title.setVisible(isVisible_);
		AERMMDLNDradius_spinner.setVisible(isVisible_);
		AERMMDLNDradius_desc.setVisible(isVisible_);
	}

	protected void setAERMMDSDtypeVisible(boolean isVisible_) {
		AERMMDSDType_title.setVisible(isVisible_);
		AERMMDSDType_combo.setVisible(isVisible_);
		AERMMDSDType_desc.setVisible(isVisible_);
	}

	protected void setAERMMDMIwaVisible(boolean isVisible_) {
		AERMMDMIwa_title.setVisible(isVisible_);
		AERMMDMIwa_spinner.setVisible(isVisible_);
		AERMMDMIwa_desc.setVisible(isVisible_);
	}

	protected void setAERMMDMRwaVisible(boolean isVisible_) {
		AERMMDMRwa_title.setVisible(isVisible_);
		AERMMDMRwa_spinner.setVisible(isVisible_);
		AERMMDMRwa_desc.setVisible(isVisible_);
	}

	@Override
	protected void onResetBtnAction() {
		int n = JOptionPane
				.showConfirmDialog(
						this,
						"This action erases all user modifications, and reload form fields\n as if the application just come to be installed.\n\nAre you sure you want to reset all fields ?",
						"Confirm reset action ?", JOptionPane.YES_NO_OPTION);
		if (n == JOptionPane.YES_OPTION) {
			try {
				PreferencesFactory.getInstance().getAerosolsModel().reset();
			} catch (InitException e_) {
				log.error(e_.getMessage(), e_);
			}
			init();
		}
	}

	@Override
	public boolean isFormValid() {
		return validateAerosolsModelForm();
	}
	
	@Override
	public void checkChanges() {
		check_AERWaref_VS_OSOAAWa_Condition();
	}

}
