/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class ANestedExplicitInitialisationArray extends PExplicitInitialisationArray
{
    private TLBrace _lBrace_;
    private PExplicitInitialisationArrayList _explicitInitialisationArrayList_;
    private TRBrace _rBrace_;

    public ANestedExplicitInitialisationArray()
    {
        // Constructor
    }

    public ANestedExplicitInitialisationArray(
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") PExplicitInitialisationArrayList _explicitInitialisationArrayList_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setLBrace(_lBrace_);

        setExplicitInitialisationArrayList(_explicitInitialisationArrayList_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new ANestedExplicitInitialisationArray(
            cloneNode(this._lBrace_),
            cloneNode(this._explicitInitialisationArrayList_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseANestedExplicitInitialisationArray(this);
    }

    public TLBrace getLBrace()
    {
        return this._lBrace_;
    }

    public void setLBrace(TLBrace node)
    {
        if(this._lBrace_ != null)
        {
            this._lBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lBrace_ = node;
    }

    public PExplicitInitialisationArrayList getExplicitInitialisationArrayList()
    {
        return this._explicitInitialisationArrayList_;
    }

    public void setExplicitInitialisationArrayList(PExplicitInitialisationArrayList node)
    {
        if(this._explicitInitialisationArrayList_ != null)
        {
            this._explicitInitialisationArrayList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._explicitInitialisationArrayList_ = node;
    }

    public TRBrace getRBrace()
    {
        return this._rBrace_;
    }

    public void setRBrace(TRBrace node)
    {
        if(this._rBrace_ != null)
        {
            this._rBrace_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rBrace_ = node;
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._lBrace_)
            + toString(this._explicitInitialisationArrayList_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._explicitInitialisationArrayList_ == child)
        {
            this._explicitInitialisationArrayList_ = null;
            return;
        }

        if(this._rBrace_ == child)
        {
            this._rBrace_ = null;
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(this._explicitInitialisationArrayList_ == oldChild)
        {
            setExplicitInitialisationArrayList((PExplicitInitialisationArrayList) newChild);
            return;
        }

        if(this._rBrace_ == oldChild)
        {
            setRBrace((TRBrace) newChild);
            return;
        }

        throw new RuntimeException("Not a child.");
    }
}
