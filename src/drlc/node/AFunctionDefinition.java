/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AFunctionDefinition extends PFunctionDefinition
{
    private TFn _fn_;
    private TName _name_;
    private TLPar _lPar_;
    private PParameterList _parameterList_;
    private TRPar _rPar_;
    private PReturnType _returnType_;
    private TLBrace _lBrace_;
    private PScopeContents _scopeContents_;
    private TRBrace _rBrace_;

    public AFunctionDefinition()
    {
        // Constructor
    }

    public AFunctionDefinition(
        @SuppressWarnings("hiding") TFn _fn_,
        @SuppressWarnings("hiding") TName _name_,
        @SuppressWarnings("hiding") TLPar _lPar_,
        @SuppressWarnings("hiding") PParameterList _parameterList_,
        @SuppressWarnings("hiding") TRPar _rPar_,
        @SuppressWarnings("hiding") PReturnType _returnType_,
        @SuppressWarnings("hiding") TLBrace _lBrace_,
        @SuppressWarnings("hiding") PScopeContents _scopeContents_,
        @SuppressWarnings("hiding") TRBrace _rBrace_)
    {
        // Constructor
        setFn(_fn_);

        setName(_name_);

        setLPar(_lPar_);

        setParameterList(_parameterList_);

        setRPar(_rPar_);

        setReturnType(_returnType_);

        setLBrace(_lBrace_);

        setScopeContents(_scopeContents_);

        setRBrace(_rBrace_);

    }

    @Override
    public Object clone()
    {
        return new AFunctionDefinition(
            cloneNode(this._fn_),
            cloneNode(this._name_),
            cloneNode(this._lPar_),
            cloneNode(this._parameterList_),
            cloneNode(this._rPar_),
            cloneNode(this._returnType_),
            cloneNode(this._lBrace_),
            cloneNode(this._scopeContents_),
            cloneNode(this._rBrace_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAFunctionDefinition(this);
    }

    public TFn getFn()
    {
        return this._fn_;
    }

    public void setFn(TFn node)
    {
        if(this._fn_ != null)
        {
            this._fn_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._fn_ = node;
    }

    public TName getName()
    {
        return this._name_;
    }

    public void setName(TName node)
    {
        if(this._name_ != null)
        {
            this._name_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._name_ = node;
    }

    public TLPar getLPar()
    {
        return this._lPar_;
    }

    public void setLPar(TLPar node)
    {
        if(this._lPar_ != null)
        {
            this._lPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._lPar_ = node;
    }

    public PParameterList getParameterList()
    {
        return this._parameterList_;
    }

    public void setParameterList(PParameterList node)
    {
        if(this._parameterList_ != null)
        {
            this._parameterList_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._parameterList_ = node;
    }

    public TRPar getRPar()
    {
        return this._rPar_;
    }

    public void setRPar(TRPar node)
    {
        if(this._rPar_ != null)
        {
            this._rPar_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._rPar_ = node;
    }

    public PReturnType getReturnType()
    {
        return this._returnType_;
    }

    public void setReturnType(PReturnType node)
    {
        if(this._returnType_ != null)
        {
            this._returnType_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._returnType_ = node;
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

    public PScopeContents getScopeContents()
    {
        return this._scopeContents_;
    }

    public void setScopeContents(PScopeContents node)
    {
        if(this._scopeContents_ != null)
        {
            this._scopeContents_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._scopeContents_ = node;
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
            + toString(this._fn_)
            + toString(this._name_)
            + toString(this._lPar_)
            + toString(this._parameterList_)
            + toString(this._rPar_)
            + toString(this._returnType_)
            + toString(this._lBrace_)
            + toString(this._scopeContents_)
            + toString(this._rBrace_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._fn_ == child)
        {
            this._fn_ = null;
            return;
        }

        if(this._name_ == child)
        {
            this._name_ = null;
            return;
        }

        if(this._lPar_ == child)
        {
            this._lPar_ = null;
            return;
        }

        if(this._parameterList_ == child)
        {
            this._parameterList_ = null;
            return;
        }

        if(this._rPar_ == child)
        {
            this._rPar_ = null;
            return;
        }

        if(this._returnType_ == child)
        {
            this._returnType_ = null;
            return;
        }

        if(this._lBrace_ == child)
        {
            this._lBrace_ = null;
            return;
        }

        if(this._scopeContents_ == child)
        {
            this._scopeContents_ = null;
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
        if(this._fn_ == oldChild)
        {
            setFn((TFn) newChild);
            return;
        }

        if(this._name_ == oldChild)
        {
            setName((TName) newChild);
            return;
        }

        if(this._lPar_ == oldChild)
        {
            setLPar((TLPar) newChild);
            return;
        }

        if(this._parameterList_ == oldChild)
        {
            setParameterList((PParameterList) newChild);
            return;
        }

        if(this._rPar_ == oldChild)
        {
            setRPar((TRPar) newChild);
            return;
        }

        if(this._returnType_ == oldChild)
        {
            setReturnType((PReturnType) newChild);
            return;
        }

        if(this._lBrace_ == oldChild)
        {
            setLBrace((TLBrace) newChild);
            return;
        }

        if(this._scopeContents_ == oldChild)
        {
            setScopeContents((PScopeContents) newChild);
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
