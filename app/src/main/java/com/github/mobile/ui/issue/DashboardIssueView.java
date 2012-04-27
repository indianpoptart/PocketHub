package com.github.mobile.ui.issue;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.github.mobile.R.id;
import com.github.mobile.ui.ItemView;
import com.github.mobile.util.TypefaceHelper;

/**
 * View used to display a dashboard issue
 */
public class DashboardIssueView extends ItemView {

    /**
     * Text view of repository id
     */
    public final TextView repoText;

    /**
     * Issue number text view
     */
    public final TextView number;

    /**
     * Issue title text view
     */
    public final TextView title;

    /**
     * Issue opener avatar image view
     */
    public final ImageView gravatar;

    /**
     * Issue opener text view
     */
    public final TextView user;

    /**
     * Creation time text view
     */
    public final TextView creation;

    /**
     * Number of comments text view
     */
    public final TextView comments;

    /**
     * Pull request icon text view
     */
    public final TextView pullRequestIcon;

    /**
     * Initial paint flags of {@link #number}
     */
    public final int numberPaintFlags;

    /**
     * @param view
     */
    public DashboardIssueView(View view) {
        super(view);

        repoText = (TextView) view.findViewById(id.tv_issue_repo_name);
        number = (TextView) view.findViewById(id.tv_issue_number);
        numberPaintFlags = number.getPaintFlags();
        title = (TextView) view.findViewById(id.tv_issue_title);
        gravatar = (ImageView) view.findViewById(id.iv_gravatar);
        user = (TextView) view.findViewById(id.tv_issue_user);
        creation = (TextView) view.findViewById(id.tv_issue_creation);
        comments = (TextView) view.findViewById(id.tv_issue_comments);

        pullRequestIcon = (TextView) view.findViewById(id.tv_pull_request_icon);
        TypefaceHelper.setOctocons(pullRequestIcon, (TextView) view.findViewById(id.tv_comment_icon));
    }
}