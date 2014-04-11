package eu.musesproject.client.model.actuators;

public class Setting {
	public enum SettingType {
		SETTING_SENSOR_ENABLE,
		SETTING_SENSOR_DISABLE
	}
	
	private SettingType settingType;
	private String value;
	
	public SettingType getSettingType() {
		return settingType;
	}
	public void setSettingType(SettingType settingType) {
		this.settingType = settingType;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
}