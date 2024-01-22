/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AWordScalar extends PScalar
{
    private TWordValue _wordValue_;

    public AWordScalar()
    {
        // Constructor
    }

    public AWordScalar(
        @SuppressWarnings("hiding") TWordValue _wordValue_)
    {
        // Constructor
        setWordValue(_wordValue_);

    }

    @Override
    public Object clone()
    {
        return new AWordScalar(
            cloneNode(this._wordValue_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAWordScalar(this);
    }

    public TWordValue getWordValue()
    {
        return this._wordValue_;
    }

    public void setWordValue(TWordValue node)
    {
        if(this._wordValue_ != null)
        {
            this._wordValue_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._wordValue_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._wordValue_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._wordValue_ == child)
        {
            this._wordValue_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._wordValue_ == oldChild)
        {
            setWordValue((TWordValue) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
