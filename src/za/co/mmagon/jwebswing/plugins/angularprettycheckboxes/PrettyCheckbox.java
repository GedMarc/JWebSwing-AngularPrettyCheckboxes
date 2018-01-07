package za.co.mmagon.jwebswing.plugins.angularprettycheckboxes;

import za.co.mmagon.jwebswing.base.angular.AngularAttributes;
import za.co.mmagon.jwebswing.base.angular.AngularPageConfigurator;
import za.co.mmagon.jwebswing.base.html.Input;
import za.co.mmagon.jwebswing.base.html.attributes.NoAttributes;

import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_EMPTY;
import static za.co.mmagon.jwebswing.utilities.StaticStrings.STRING_SINGLE_QUOTES;

/**
 * Denotes a physical pretty checkbox that has angular binding capabilities
 *
 * @param <J>
 */
public class PrettyCheckbox<J extends PrettyCheckbox<J>> extends Input<NoAttributes, J>
{
	/**
	 * Required for radio
	 * Used as true value for checkbox
	 */
	private String value;
	/**
	 * Optional. Defaults to value if ommited.
	 * <p>
	 * Set to false remove label.
	 */
	private String label;
	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 */
	private Boolean disabled;
	/**
	 * Puts the label before (left of) the control
	 */
	private Boolean labelLeft;
	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 */
	private Boolean multiple;

	/**
	 * Creates a new pretty checkboxes item
	 */
	public PrettyCheckbox()
	{
		setTag("pretty-checkbox");
	}

	@Override
	@SuppressWarnings("unchecked")
	public J bind(String variableName)
	{
		addAttribute(AngularAttributes.ngModel, variableName);
		AngularPageConfigurator.setRequired(true);
		return (J) this;
	}

	@Override
	public void init()
	{
		if (!isInitialized())
		{
			if (getMultiple() != null)
			{
				addAttribute("multiple", STRING_EMPTY);
			}
			if (getLabel() != null)
			{
				addAttribute("label", STRING_SINGLE_QUOTES + getLabel() + STRING_SINGLE_QUOTES);
			}
			if (getValue() != null)
			{
				addAttribute("value", STRING_SINGLE_QUOTES + getValue() + STRING_SINGLE_QUOTES);
			}
			if (getDisabled() != null)
			{
				addAttribute("disabled", Boolean.toString(getDisabled()));
			}
			if (getLabelLeft() != null)
			{
				addAttribute("label-left", Boolean.toString(getLabelLeft()));
			}
		}
		super.init();
	}

	/**
	 * Required for radio
	 * Used as true value for checkbox
	 *
	 * @return
	 */
	public String getValue()
	{
		return value;
	}

	@Override
	@SuppressWarnings("unchecked")
	public J setRequired()
	{
		addAttribute(AngularAttributes.ngRequired, "true");
		return (J) this;
	}

	/**
	 * Optional. Defaults to value if ommited.
	 * <p>
	 * Set to false remove label.
	 *
	 * @return
	 */
	public String getLabel()
	{
		return label;
	}

	/**
	 * Required for radio
	 * Used as true value for checkbox
	 *
	 * @param value
	 *
	 * @return
	 */
	@Override
	@SuppressWarnings("unchecked")
	public J setValue(String value)
	{
		this.value = value;
		return (J) this;
	}

	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 *
	 * @return
	 */
	public Boolean getDisabled()
	{
		return disabled;
	}

	@Override
	public int hashCode()
	{
		return super.hashCode();
	}

	/**
	 * Puts the label before (left of) the control
	 *
	 * @return
	 */
	public Boolean getLabelLeft()
	{
		return labelLeft;
	}

	/**
	 * Optional. Defaults to value if ommited.
	 *
	 * @param label
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabel(String label)
	{
		this.label = label;
		return (J) this;
	}

	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 *
	 * @return
	 */
	public Boolean getMultiple()
	{
		return multiple;
	}

	/**
	 * Disables checkbox if set to true. (also supports ng-disabled)
	 *
	 * @param disabled
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setDisabled(Boolean disabled)
	{
		this.disabled = disabled;
		return (J) this;
	}

	/**
	 * Puts the label before (left of) the control
	 *
	 * @param labelLeft
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setLabelLeft(Boolean labelLeft)
	{
		this.labelLeft = labelLeft;
		return (J) this;
	}

	@Override
	public boolean equals(Object o)
	{
		if (this == o)
		{
			return true;
		}
		if (!(o instanceof PrettyCheckbox))
		{
			return false;
		}
		if (!super.equals(o))
		{
			return false;
		}

		PrettyCheckbox<?> that = (PrettyCheckbox<?>) o;

		if (getValue() != null ? !getValue().equals(that.getValue()) : that.getValue() != null)
		{
			return false;
		}
		if (getLabel() != null ? !getLabel().equals(that.getLabel()) : that.getLabel() != null)
		{
			return false;
		}
		if (getDisabled() != null ? !getDisabled().equals(that.getDisabled()) : that.getDisabled() != null)
		{
			return false;
		}
		if (getLabelLeft() != null ? !getLabelLeft().equals(that.getLabelLeft()) : that.getLabelLeft() != null)
		{
			return false;
		}
		return getMultiple() != null ? getMultiple().equals(that.getMultiple()) : that.getMultiple() == null;
	}

	/**
	 * If provided this allows multiple checkboxes to share a single model (stores data as an array)
	 *
	 * @param multiple
	 *
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public J setMultiple(Boolean multiple)
	{
		this.multiple = multiple;
		return (J) this;
	}
}
