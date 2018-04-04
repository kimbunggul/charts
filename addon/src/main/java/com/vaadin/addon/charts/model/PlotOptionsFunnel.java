package com.vaadin.addon.charts.model;

/*
 * #%L
 * Vaadin Charts Addon
 * %%
 * Copyright (C) 2012 - 2018 Vaadin Ltd
 * %%
 * This program is available under Commercial Vaadin Add-On License 3.0
 * (CVALv3).
 * 
 * See the file licensing.txt distributed with this software for more
 * information about licensing.
 * 
 * You should have received a copy of the CVALv3 along with this program.
 * If not, see <https://vaadin.com/license/cval-3>.
 * #L%
 */

import javax.annotation.Generated;
import com.vaadin.addon.charts.model.style.Color;
import java.util.ArrayList;
import java.util.Arrays;
import com.vaadin.server.SizeWithUnit;
import com.vaadin.server.Sizeable.Unit;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.vaadin.addon.charts.model.serializers.SizeSerializer;
/**
 * Funnel charts are a type of chart often used to visualize stages in a sales
 * project, where the top are the initial stages with the most clients. It
 * requires that the <code>modules/funnel.js</code> file is loaded.
 */
@Generated(value = "This class is generated and shouldn't be modified", comments = "Incorrect and missing API should be reported to https://github.com/vaadin/charts/issues/new")
public class PlotOptionsFunnel extends PyramidOptions {

	private Boolean allowPointSelect;
	private Number animationLimit;
	private Color borderColor;
	private Number borderWidth;
	private String[] center;
	private String className;
	private Number colorIndex;
	private ArrayList<Color> colors;
	private Cursor cursor;
	private DataLabelsFunnel dataLabels;
	private Number depth;
	private String description;
	private Boolean enableMouseTracking;
	private Boolean exposeElementToA11y;
	private String findNearestPointBy;
	private Boolean getExtremesFromAll;
	@JsonSerialize(using = SizeSerializer.class)
	private String height;
	private ArrayList<String> keys;
	private String linkedTo;
	private Number minSize;
	@JsonSerialize(using = SizeSerializer.class)
	private String neckHeight;
	@JsonSerialize(using = SizeSerializer.class)
	private String neckWidth;
	private Object pointDescriptionFormatter;
	private Boolean reversed;
	private Boolean selected;
	private Boolean shadow;
	private Boolean showInLegend;
	private Boolean skipKeyboardNavigation;
	private Number slicedOffset;
	private States states;
	private Boolean stickyTracking;
	private SeriesTooltip tooltip;
	private Boolean visible;
	@JsonSerialize(using = SizeSerializer.class)
	private String width;
	private String zoneAxis;
	private ArrayList<Zones> zones;

	public PlotOptionsFunnel() {
	}

	@Override
	public ChartType getChartType() {
		return ChartType.FUNNEL;
	}

	/**
	 * @see #setAllowPointSelect(Boolean)
	 */
	public Boolean getAllowPointSelect() {
		return allowPointSelect;
	}

	/**
	 * Allow this series' points to be selected by clicking on the markers, bars
	 * or pie slices.
	 * <p>
	 * Defaults to: false
	 */
	public void setAllowPointSelect(Boolean allowPointSelect) {
		this.allowPointSelect = allowPointSelect;
	}

	/**
	 * @see #setAnimationLimit(Number)
	 */
	public Number getAnimationLimit() {
		return animationLimit;
	}

	/**
	 * For some series, there is a limit that shuts down initial animation by
	 * default when the total number of points in the chart is too high. For
	 * example, for a column chart and its derivatives, animation doesn't run if
	 * there is more than 250 points totally. To disable this cap, set
	 * <code>animationLimit</code> to <code>Infinity</code>.
	 */
	public void setAnimationLimit(Number animationLimit) {
		this.animationLimit = animationLimit;
	}

	/**
	 * @see #setBorderColor(Color)
	 */
	public Color getBorderColor() {
		return borderColor;
	}

	/**
	 * <p>
	 * The color of the border surrounding each slice. When <code>null</code>,
	 * the border takes the same color as the slice fill. This can be used
	 * together with a <code>borderWidth</code> to fill drawing gaps created by
	 * antialiazing artefacts in borderless pies.
	 * </p>
	 * 
	 * <p>
	 * Defaults to: #ffffff
	 */
	public void setBorderColor(Color borderColor) {
		this.borderColor = borderColor;
	}

	/**
	 * @see #setBorderWidth(Number)
	 */
	public Number getBorderWidth() {
		return borderWidth;
	}

	/**
	 * <p>
	 * The width of the border surrounding each slice.
	 * </p>
	 * 
	 * <p>
	 * When setting the border width to 0, there may be small gaps between the
	 * slices due to SVG antialiasing artefacts. To work around this, keep the
	 * border width at 0.5 or 1, but set the <code>borderColor</code> to
	 * <code>null</code> instead.
	 * </p>
	 * 
	 * <p>
	 * Defaults to: 1
	 */
	public void setBorderWidth(Number borderWidth) {
		this.borderWidth = borderWidth;
	}

	/**
	 * The center of the series. By default, it is centered in the middle of the
	 * plot area, so it fills the plot area height.
	 * <p>
	 * Defaults to: ["50%", "50%"]
	 */
	public void setCenter(String[] center) {
		this.center = center;
	}

	/**
	 * @see #setClassName(String)
	 */
	public String getClassName() {
		return className;
	}

	/**
	 * A class name to apply to the series' graphical elements.
	 */
	public void setClassName(String className) {
		this.className = className;
	}

	/**
	 * @see #setColorIndex(Number)
	 */
	public Number getColorIndex() {
		return colorIndex;
	}

	/**
	 * 
	 */
	public void setColorIndex(Number colorIndex) {
		this.colorIndex = colorIndex;
	}

	/**
	 * @see #setColors(Color...)
	 */
	public Color[] getColors() {
		if (colors == null) {
			return new Color[]{};
		}
		Color[] arr = new Color[colors.size()];
		colors.toArray(arr);
		return arr;
	}

	/**
	 * A series specific or series type specific color set to use instead of the
	 * global <a href="#colors">colors</a>.
	 */
	public void setColors(Color... colors) {
		this.colors = new ArrayList<Color>(Arrays.asList(colors));
	}

	/**
	 * Adds color to the colors array
	 * 
	 * @param color
	 *            to add
	 * @see #setColors(Color...)
	 */
	public void addColor(Color color) {
		if (this.colors == null) {
			this.colors = new ArrayList<Color>();
		}
		this.colors.add(color);
	}

	/**
	 * Removes first occurrence of color in colors array
	 * 
	 * @param color
	 *            to remove
	 * @see #setColors(Color...)
	 */
	public void removeColor(Color color) {
		this.colors.remove(color);
	}

	/**
	 * @see #setCursor(Cursor)
	 */
	public Cursor getCursor() {
		return cursor;
	}

	/**
	 * You can set the cursor to "pointer" if you have click events attached to
	 * the series, to signal to the user that the points and lines can be
	 * clicked.
	 */
	public void setCursor(Cursor cursor) {
		this.cursor = cursor;
	}

	/**
	 * @see #setDataLabels(DataLabelsFunnel)
	 */
	public DataLabelsFunnel getDataLabels() {
		if (dataLabels == null) {
			dataLabels = new DataLabelsFunnel();
		}
		return dataLabels;
	}

	public void setDataLabels(DataLabelsFunnel dataLabels) {
		this.dataLabels = dataLabels;
	}

	/**
	 * @see #setDepth(Number)
	 */
	public Number getDepth() {
		return depth;
	}

	/**
	 * The thickness of a 3D pie. Requires <code>highcharts-3d.js</code>
	 * <p>
	 * Defaults to: 0
	 */
	public void setDepth(Number depth) {
		this.depth = depth;
	}

	/**
	 * @see #setDescription(String)
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <p>
	 * <i>Requires Accessibility module</i>
	 * </p>
	 * <p>
	 * A description of the series to add to the screen reader information about
	 * the series.
	 * </p>
	 * <p>
	 * Defaults to: undefined
	 */
	public void setDescription(String description) {
		this.description = description;
	}

	/**
	 * @see #setEnableMouseTracking(Boolean)
	 */
	public Boolean getEnableMouseTracking() {
		return enableMouseTracking;
	}

	/**
	 * Enable or disable the mouse tracking for a specific series. This includes
	 * point tooltips and click events on graphs and points. For large datasets
	 * it improves performance.
	 * <p>
	 * Defaults to: true
	 */
	public void setEnableMouseTracking(Boolean enableMouseTracking) {
		this.enableMouseTracking = enableMouseTracking;
	}

	/**
	 * @see #setExposeElementToA11y(Boolean)
	 */
	public Boolean getExposeElementToA11y() {
		return exposeElementToA11y;
	}

	/**
	 * <p>
	 * By default, series are exposed to screen readers as regions. By enabling
	 * this option, the series element itself will be exposed in the same way as
	 * the data points. This is useful if the series is not used as a grouping
	 * entity in the chart, but you still want to attach a description to the
	 * series.
	 * </p>
	 * <p>
	 * Requires the Accessibility module.
	 * </p>
	 * <p>
	 * Defaults to: undefined
	 */
	public void setExposeElementToA11y(Boolean exposeElementToA11y) {
		this.exposeElementToA11y = exposeElementToA11y;
	}

	/**
	 * @see #setFindNearestPointBy(String)
	 */
	public String getFindNearestPointBy() {
		return findNearestPointBy;
	}

	/**
	 * <p>
	 * Determines whether the series should look for the nearest point in both
	 * dimensions or just the x-dimension when hovering the series. Defaults to
	 * <code>'xy'</code> for scatter series and <code>'x'</code> for most other
	 * series. If the data has duplicate x-values, it is recommended to set this
	 * to <code>'xy'</code> to allow hovering over all points.
	 * </p>
	 * <p>
	 * Applies only to series types using nearest neighbor search (not direct
	 * hover) for tooltip.
	 * </p>
	 */
	public void setFindNearestPointBy(String findNearestPointBy) {
		this.findNearestPointBy = findNearestPointBy;
	}

	/**
	 * @see #setGetExtremesFromAll(Boolean)
	 */
	public Boolean getGetExtremesFromAll() {
		return getExtremesFromAll;
	}

	/**
	 * Whether to use the Y extremes of the total chart width or only the zoomed
	 * area when zooming in on parts of the X axis. By default, the Y axis
	 * adjusts to the min and max of the visible data. Cartesian series only.
	 * <p>
	 * Defaults to: false
	 */
	public void setGetExtremesFromAll(Boolean getExtremesFromAll) {
		this.getExtremesFromAll = getExtremesFromAll;
	}

	/**
	 * @see #setHeight(String)
	 */
	public float getHeight() {
		String tmp = height;
		if (height == null) {
			return -1.0f;
		}
		if (this.height.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	/**
	 * Sets the height using String presentation. String presentation is similar
	 * to what is used in Cascading Style Sheets. Size can be pixels or
	 * percentage, otherwise IllegalArgumentException is thrown. The empty
	 * string ("") or null will unset the height and set the units to pixels.
	 * 
	 * @param height
	 *            CSS style string representation
	 */
	public void setHeight(String height) {
		SizeWithUnit sizeWithUnit = SizeWithUnit.parseStringSize(height);
		if (sizeWithUnit != null) {
			Unit unit = sizeWithUnit.getUnit();
			if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
				throw new IllegalArgumentException(
						unit.toString()
								+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
			}
			setHeight(sizeWithUnit.getSize(), sizeWithUnit.getUnit());
		} else {
			setHeight(-1, Unit.PIXELS);
		}
	}

	/**
	 * @see #setHeight(float,Unit)
	 */
	public Unit getHeightUnit() {
		if (this.height == null) {
			return Unit.PIXELS;
		}
		if (this.height.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	/**
	 * Sets the height using Vaadin Unit. Only Unit.PIXELS and Unit.PERCENTAGE
	 * are supported. In all other cases, IllegalArgumentException is thrown.
	 * 
	 * @param height
	 * @param unit
	 *            the unit used for the height
	 */
	public void setHeight(float height, Unit unit) {
		if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
			throw new IllegalArgumentException(
					unit.toString()
							+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
		}
		String value = Float.toString(height);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (height == -1) {
			value = null;
		}
		this.height = value;
	}

	/**
	 * @see #setKeys(String...)
	 */
	public String[] getKeys() {
		if (keys == null) {
			return new String[]{};
		}
		String[] arr = new String[keys.size()];
		keys.toArray(arr);
		return arr;
	}

	/**
	 * An array specifying which option maps to which key in the data point
	 * array. This makes it convenient to work with unstructured data arrays
	 * from different sources.
	 */
	public void setKeys(String... keys) {
		this.keys = new ArrayList<String>(Arrays.asList(keys));
	}

	/**
	 * Adds key to the keys array
	 * 
	 * @param key
	 *            to add
	 * @see #setKeys(String...)
	 */
	public void addKey(String key) {
		if (this.keys == null) {
			this.keys = new ArrayList<String>();
		}
		this.keys.add(key);
	}

	/**
	 * Removes first occurrence of key in keys array
	 * 
	 * @param key
	 *            to remove
	 * @see #setKeys(String...)
	 */
	public void removeKey(String key) {
		this.keys.remove(key);
	}

	/**
	 * @see #setLinkedTo(String)
	 */
	public String getLinkedTo() {
		return linkedTo;
	}

	/**
	 * The <a href="#series.id">id</a> of another series to link to.
	 * Additionally, the value can be ":previous" to link to the previous
	 * series. When two series are linked, only the first one appears in the
	 * legend. Toggling the visibility of this also toggles the linked series.
	 */
	public void setLinkedTo(String linkedTo) {
		this.linkedTo = linkedTo;
	}

	/**
	 * @see #setMinSize(Number)
	 */
	public Number getMinSize() {
		return minSize;
	}

	/**
	 * The minimum size for a pie in response to auto margins. The pie will try
	 * to shrink to make room for data labels in side the plot area, but only to
	 * this size.
	 * <p>
	 * Defaults to: 80
	 */
	public void setMinSize(Number minSize) {
		this.minSize = minSize;
	}

	/**
	 * @see #setNeckHeight(String)
	 */
	public float getNeckHeight() {
		String tmp = neckHeight;
		if (neckHeight == null) {
			return -1.0f;
		}
		if (this.neckHeight.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	/**
	 * Sets the neckHeight using String presentation. String presentation is
	 * similar to what is used in Cascading Style Sheets. Size can be pixels or
	 * percentage, otherwise IllegalArgumentException is thrown. The empty
	 * string ("") or null will unset the height and set the units to pixels.
	 * 
	 * @param neckHeight
	 *            CSS style string representation
	 */
	public void setNeckHeight(String neckHeight) {
		SizeWithUnit sizeWithUnit = SizeWithUnit.parseStringSize(neckHeight);
		if (sizeWithUnit != null) {
			Unit unit = sizeWithUnit.getUnit();
			if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
				throw new IllegalArgumentException(
						unit.toString()
								+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
			}
			setNeckHeight(sizeWithUnit.getSize(), sizeWithUnit.getUnit());
		} else {
			setNeckHeight(-1, Unit.PIXELS);
		}
	}

	/**
	 * @see #setNeckHeight(float,Unit)
	 */
	public Unit getNeckHeightUnit() {
		if (this.neckHeight == null) {
			return Unit.PIXELS;
		}
		if (this.neckHeight.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	/**
	 * Sets the neckHeight using Vaadin Unit. Only Unit.PIXELS and
	 * Unit.PERCENTAGE are supported. In all other cases,
	 * IllegalArgumentException is thrown.
	 * 
	 * @param neckHeight
	 * @param unit
	 *            the unit used for the neckHeight
	 */
	public void setNeckHeight(float neckHeight, Unit unit) {
		if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
			throw new IllegalArgumentException(
					unit.toString()
							+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
		}
		String value = Float.toString(neckHeight);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (neckHeight == -1) {
			value = null;
		}
		this.neckHeight = value;
	}

	/**
	 * @see #setNeckWidth(String)
	 */
	public float getNeckWidth() {
		String tmp = neckWidth;
		if (neckWidth == null) {
			return -1.0f;
		}
		if (this.neckWidth.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	/**
	 * Sets the neckWidth using String presentation. String presentation is
	 * similar to what is used in Cascading Style Sheets. Size can be pixels or
	 * percentage, otherwise IllegalArgumentException is thrown. The empty
	 * string ("") or null will unset the height and set the units to pixels.
	 * 
	 * @param neckWidth
	 *            CSS style string representation
	 */
	public void setNeckWidth(String neckWidth) {
		SizeWithUnit sizeWithUnit = SizeWithUnit.parseStringSize(neckWidth);
		if (sizeWithUnit != null) {
			Unit unit = sizeWithUnit.getUnit();
			if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
				throw new IllegalArgumentException(
						unit.toString()
								+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
			}
			setNeckWidth(sizeWithUnit.getSize(), sizeWithUnit.getUnit());
		} else {
			setNeckWidth(-1, Unit.PIXELS);
		}
	}

	/**
	 * @see #setNeckWidth(float,Unit)
	 */
	public Unit getNeckWidthUnit() {
		if (this.neckWidth == null) {
			return Unit.PIXELS;
		}
		if (this.neckWidth.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	/**
	 * Sets the neckWidth using Vaadin Unit. Only Unit.PIXELS and
	 * Unit.PERCENTAGE are supported. In all other cases,
	 * IllegalArgumentException is thrown.
	 * 
	 * @param neckWidth
	 * @param unit
	 *            the unit used for the neckWidth
	 */
	public void setNeckWidth(float neckWidth, Unit unit) {
		if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
			throw new IllegalArgumentException(
					unit.toString()
							+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
		}
		String value = Float.toString(neckWidth);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (neckWidth == -1) {
			value = null;
		}
		this.neckWidth = value;
	}

	/**
	 * @see #setPointDescriptionFormatter(Object)
	 */
	public Object getPointDescriptionFormatter() {
		if (pointDescriptionFormatter == null) {
			pointDescriptionFormatter = new Object();
		}
		return pointDescriptionFormatter;
	}

	/**
	 * Same as <a href="#accessibility.pointDescriptionFormatter">accessibility.
	 * pointDescriptionFormatter</a>, but for an individual series. Overrides
	 * the chart wide configuration.
	 */
	public void setPointDescriptionFormatter(Object pointDescriptionFormatter) {
		this.pointDescriptionFormatter = pointDescriptionFormatter;
	}

	/**
	 * @see #setReversed(Boolean)
	 */
	public Boolean getReversed() {
		return reversed;
	}

	/**
	 * A reversed funnel has the widest area down. A reversed funnel with no
	 * neck width and neck height is a pyramid.
	 * <p>
	 * Defaults to: false
	 */
	public void setReversed(Boolean reversed) {
		this.reversed = reversed;
	}

	/**
	 * @see #setSelected(Boolean)
	 */
	public Boolean getSelected() {
		return selected;
	}

	/**
	 * Whether to select the series initially. If <code>showCheckbox</code> is
	 * true, the checkbox next to the series name will be checked for a selected
	 * series.
	 * <p>
	 * Defaults to: false
	 */
	public void setSelected(Boolean selected) {
		this.selected = selected;
	}

	/**
	 * @see #setShadow(Boolean)
	 */
	public Boolean getShadow() {
		return shadow;
	}

	/**
	 * Whether to apply a drop shadow to the graph line. Since 2.3 the shadow
	 * can be an object configuration containing <code>color</code>,
	 * <code>offsetX</code>, <code>offsetY</code>, <code>opacity</code> and
	 * <code>width</code>.
	 * <p>
	 * Defaults to: false
	 */
	public void setShadow(Boolean shadow) {
		this.shadow = shadow;
	}

	/**
	 * @see #setShowInLegend(Boolean)
	 */
	public Boolean getShowInLegend() {
		return showInLegend;
	}

	/**
	 * Whether to display this particular series or series type in the legend.
	 * Since 2.1, pies are not shown in the legend by default.
	 * <p>
	 * Defaults to: false
	 */
	public void setShowInLegend(Boolean showInLegend) {
		this.showInLegend = showInLegend;
	}

	/**
	 * @see #setSkipKeyboardNavigation(Boolean)
	 */
	public Boolean getSkipKeyboardNavigation() {
		return skipKeyboardNavigation;
	}

	/**
	 * If set to <code>True</code>, the accessibility module will skip past the
	 * points in this series for keyboard navigation.
	 */
	public void setSkipKeyboardNavigation(Boolean skipKeyboardNavigation) {
		this.skipKeyboardNavigation = skipKeyboardNavigation;
	}

	/**
	 * @see #setSlicedOffset(Number)
	 */
	public Number getSlicedOffset() {
		return slicedOffset;
	}

	/**
	 * If a point is sliced, moved out from the center, how many pixels should
	 * it be moved?.
	 * <p>
	 * Defaults to: 10
	 */
	public void setSlicedOffset(Number slicedOffset) {
		this.slicedOffset = slicedOffset;
	}

	/**
	 * @see #setStates(States)
	 */
	public States getStates() {
		if (states == null) {
			states = new States();
		}
		return states;
	}

	/**
	 * A wrapper object for all the series options in specific states.
	 */
	public void setStates(States states) {
		this.states = states;
	}

	/**
	 * @see #setStickyTracking(Boolean)
	 */
	public Boolean getStickyTracking() {
		return stickyTracking;
	}

	/**
	 * Sticky tracking of mouse events. When true, the <code>mouseOut</code>
	 * event on a series isn't triggered until the mouse moves over another
	 * series, or out of the plot area. When false, the <code>mouseOut</code>
	 * event on a series is triggered when the mouse leaves the area around the
	 * series' graph or markers. This also implies the tooltip. When
	 * <code>stickyTracking</code> is false and <code>tooltip.shared</code> is
	 * false, the tooltip will be hidden when moving the mouse between series.
	 * <p>
	 * Defaults to: false
	 */
	public void setStickyTracking(Boolean stickyTracking) {
		this.stickyTracking = stickyTracking;
	}

	/**
	 * @see #setTooltip(SeriesTooltip)
	 */
	public SeriesTooltip getTooltip() {
		if (tooltip == null) {
			tooltip = new SeriesTooltip();
		}
		return tooltip;
	}

	/**
	 * A configuration object for the tooltip rendering of each single series.
	 * Properties are inherited from <a href="#tooltip">tooltip</a>, but only
	 * the following properties can be defined on a series level.
	 */
	public void setTooltip(SeriesTooltip tooltip) {
		this.tooltip = tooltip;
	}

	/**
	 * @see #setVisible(Boolean)
	 */
	public Boolean getVisible() {
		return visible;
	}

	/**
	 * Set the initial visibility of the series.
	 * <p>
	 * Defaults to: true
	 */
	public void setVisible(Boolean visible) {
		this.visible = visible;
	}

	/**
	 * @see #setWidth(String)
	 */
	public float getWidth() {
		String tmp = width;
		if (width == null) {
			return -1.0f;
		}
		if (this.width.contains("%")) {
			tmp = tmp.replace("%", "");
		}
		return Float.valueOf(tmp).floatValue();
	}

	/**
	 * Sets the width using String presentation. String presentation is similar
	 * to what is used in Cascading Style Sheets. Size can be pixels or
	 * percentage, otherwise IllegalArgumentException is thrown. The empty
	 * string ("") or null will unset the height and set the units to pixels.
	 * 
	 * @param width
	 *            CSS style string representation
	 */
	public void setWidth(String width) {
		SizeWithUnit sizeWithUnit = SizeWithUnit.parseStringSize(width);
		if (sizeWithUnit != null) {
			Unit unit = sizeWithUnit.getUnit();
			if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
				throw new IllegalArgumentException(
						unit.toString()
								+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
			}
			setWidth(sizeWithUnit.getSize(), sizeWithUnit.getUnit());
		} else {
			setWidth(-1, Unit.PIXELS);
		}
	}

	/**
	 * @see #setWidth(float,Unit)
	 */
	public Unit getWidthUnit() {
		if (this.width == null) {
			return Unit.PIXELS;
		}
		if (this.width.contains("%")) {
			return Unit.PERCENTAGE;
		}
		return Unit.PIXELS;
	}

	/**
	 * Sets the width using Vaadin Unit. Only Unit.PIXELS and Unit.PERCENTAGE
	 * are supported. In all other cases, IllegalArgumentException is thrown.
	 * 
	 * @param width
	 * @param unit
	 *            the unit used for the width
	 */
	public void setWidth(float width, Unit unit) {
		if (!(unit.equals(Unit.PERCENTAGE) || unit.equals(Unit.PIXELS))) {
			throw new IllegalArgumentException(
					unit.toString()
							+ "is not a valid unit for sizing. Only percentage and pixels are allowed.");
		}
		String value = Float.toString(width);
		if (unit.equals(Unit.PERCENTAGE)) {
			value += "%";
		}
		if (width == -1) {
			value = null;
		}
		this.width = value;
	}

	/**
	 * @see #setZoneAxis(String)
	 */
	public String getZoneAxis() {
		return zoneAxis;
	}

	/**
	 * Defines the Axis on which the zones are applied.
	 * <p>
	 * Defaults to: y
	 */
	public void setZoneAxis(String zoneAxis) {
		this.zoneAxis = zoneAxis;
	}

	/**
	 * @see #setZones(Zones...)
	 */
	public Zones[] getZones() {
		if (zones == null) {
			return new Zones[]{};
		}
		Zones[] arr = new Zones[zones.size()];
		zones.toArray(arr);
		return arr;
	}

	/**
	 * <p>
	 * An array defining zones within a series. Zones can be applied to the X
	 * axis, Y axis or Z axis for bubbles, according to the
	 * <code>zoneAxis</code> option.
	 * </p>
	 */
	public void setZones(Zones... zones) {
		this.zones = new ArrayList<Zones>(Arrays.asList(zones));
	}

	/**
	 * Adds zone to the zones array
	 * 
	 * @param zone
	 *            to add
	 * @see #setZones(Zones...)
	 */
	public void addZone(Zones zone) {
		if (this.zones == null) {
			this.zones = new ArrayList<Zones>();
		}
		this.zones.add(zone);
	}

	/**
	 * Removes first occurrence of zone in zones array
	 * 
	 * @param zone
	 *            to remove
	 * @see #setZones(Zones...)
	 */
	public void removeZone(Zones zone) {
		this.zones.remove(zone);
	}

	public void setCenter(String x, String y) {
		this.center = new String[]{x, y};
	}

	public String[] getCenter() {
		return this.center;
	}
}