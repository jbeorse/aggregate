package org.opendatakit.aggregate.client.widgets;

import org.opendatakit.aggregate.client.popups.ConfirmDeleteTablesAdmin;
import org.opendatakit.aggregate.client.popups.HelpBalloon;

import com.google.gwt.event.dom.client.ClickEvent;
import com.google.gwt.event.dom.client.ClickHandler;
import com.google.gwt.user.client.Window;
import com.google.gwt.user.client.ui.PopupPanel;

public class TablesAdminDeleteButton extends AbstractButtonBase implements ClickHandler {

	private static final String TOOLTIP_TEXT = "Delete user";

	private static final String HELP_BALLOON_TXT = "Remove the administrative user from being able to" +
			"edit data.";

	private String aggregateUid;

	public TablesAdminDeleteButton(String aggregateUid) {
		super("<img src=\"images/red_x.png\" />", TOOLTIP_TEXT);
		this.aggregateUid = aggregateUid;
		addStyleDependentName("negative");
		helpBalloon = new HelpBalloon(this, HELP_BALLOON_TXT);
	}

	@Override
	public void onClick(ClickEvent event) {
		super.onClick(event);

		// TODO: display pop-up with text from b...
		final ConfirmDeleteTablesAdmin popup = new ConfirmDeleteTablesAdmin(aggregateUid);
		popup.setPopupPositionAndShow(new PopupPanel.PositionCallback() {
			@Override
			public void setPosition(int offsetWidth, int offsetHeight) {
				int left = ((Window.getScrollLeft() + Window.getClientWidth() - offsetWidth) / 2);
				int top = ((Window.getScrollTop() + Window.getClientHeight() - offsetHeight) / 2);
				popup.setPopupPosition(left, top);
			}
		});
	}
}