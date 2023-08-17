public void setWidth(View view, int width) {
    int tempHeight = 0, addHeight = 0;
    if (view.getLayoutParams() instanceof LinearLayout.LayoutParams) {
        ((LinearLayout.LayoutParams) ((LinearLayout.LayoutParams) view.getLayoutParams())).width = width;
    } else if (view.getLayoutParams() instanceof RelativeLayout.LayoutParams) {
        ((RelativeLayout.LayoutParams) view.getLayoutParams()).width = width;
    } else if (view.getLayoutParams() instanceof FrameLayout.LayoutParams) {
        FrameLayout.LayoutParams params = (FrameLayout.LayoutParams) view.getLayoutParams();
        params.width = width;
    } else if (view.getLayoutParams() instanceof ConstraintLayout.LayoutParams) {
        ConstraintLayout.LayoutParams params = (ConstraintLayout.LayoutParams) view.getLayoutParams();
        params.width = width;
    } else {
        tempHeight = ((LinearLayout.LayoutParams) ((LinearLayout.LayoutParams) view.getLayoutParams())).width;
    }
    view.requestLayout();
}
