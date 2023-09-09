/* This file was generated by SableCC (http://www.sablecc.org/). */

package drlc.node;

import java.util.*;
import drlc.analysis.*;

@SuppressWarnings("nls")
public final class AIncludingInitializationVariableDeclaration extends PVariableDeclaration
{
    private TLet _let_;
    private PVariableDeclarator _variableDeclarator_;
    private TEquals _equals_;
    private PExpression _expression_;
    private final LinkedList<TSemicolon> _semicolon_ = new LinkedList<TSemicolon>();

    public AIncludingInitializationVariableDeclaration()
    {
        // Constructor
    }

    public AIncludingInitializationVariableDeclaration(
        @SuppressWarnings("hiding") TLet _let_,
        @SuppressWarnings("hiding") PVariableDeclarator _variableDeclarator_,
        @SuppressWarnings("hiding") TEquals _equals_,
        @SuppressWarnings("hiding") PExpression _expression_,
        @SuppressWarnings("hiding") List<?> _semicolon_)
    {
        // Constructor
        setLet(_let_);

        setVariableDeclarator(_variableDeclarator_);

        setEquals(_equals_);

        setExpression(_expression_);

        setSemicolon(_semicolon_);

    }

    @Override
    public Object clone()
    {
        return new AIncludingInitializationVariableDeclaration(
            cloneNode(this._let_),
            cloneNode(this._variableDeclarator_),
            cloneNode(this._equals_),
            cloneNode(this._expression_),
            cloneList(this._semicolon_));
    }

    @Override
    public void apply(Switch sw)
    {
        ((Analysis) sw).caseAIncludingInitializationVariableDeclaration(this);
    }

    public TLet getLet()
    {
        return this._let_;
    }

    public void setLet(TLet node)
    {
        if(this._let_ != null)
        {
            this._let_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._let_ = node;
    }

    public PVariableDeclarator getVariableDeclarator()
    {
        return this._variableDeclarator_;
    }

    public void setVariableDeclarator(PVariableDeclarator node)
    {
        if(this._variableDeclarator_ != null)
        {
            this._variableDeclarator_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._variableDeclarator_ = node;
    }

    public TEquals getEquals()
    {
        return this._equals_;
    }

    public void setEquals(TEquals node)
    {
        if(this._equals_ != null)
        {
            this._equals_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._equals_ = node;
    }

    public PExpression getExpression()
    {
        return this._expression_;
    }

    public void setExpression(PExpression node)
    {
        if(this._expression_ != null)
        {
            this._expression_.parent(null);
        }

        if(node != null)
        {
            if(node.parent() != null)
            {
                node.parent().removeChild(node);
            }

            node.parent(this);
        }

        this._expression_ = node;
    }

    public LinkedList<TSemicolon> getSemicolon()
    {
        return this._semicolon_;
    }

    public void setSemicolon(List<?> list)
    {
        for(TSemicolon e : this._semicolon_)
        {
            e.parent(null);
        }
        this._semicolon_.clear();

        for(Object obj_e : list)
        {
            TSemicolon e = (TSemicolon) obj_e;
            if(e.parent() != null)
            {
                e.parent().removeChild(e);
            }

            e.parent(this);
            this._semicolon_.add(e);
        }
    }

    @Override
    public String toString()
    {
        return ""
            + toString(this._let_)
            + toString(this._variableDeclarator_)
            + toString(this._equals_)
            + toString(this._expression_)
            + toString(this._semicolon_);
    }

    @Override
    void removeChild(@SuppressWarnings("unused") Node child)
    {
        // Remove child
        if(this._let_ == child)
        {
            this._let_ = null;
            return;
        }

        if(this._variableDeclarator_ == child)
        {
            this._variableDeclarator_ = null;
            return;
        }

        if(this._equals_ == child)
        {
            this._equals_ = null;
            return;
        }

        if(this._expression_ == child)
        {
            this._expression_ = null;
            return;
        }

        if(this._semicolon_.remove(child))
        {
            return;
        }

        throw new RuntimeException("Not a child.");
    }

    @Override
    void replaceChild(@SuppressWarnings("unused") Node oldChild, @SuppressWarnings("unused") Node newChild)
    {
        // Replace child
        if(this._let_ == oldChild)
        {
            setLet((TLet) newChild);
            return;
        }

        if(this._variableDeclarator_ == oldChild)
        {
            setVariableDeclarator((PVariableDeclarator) newChild);
            return;
        }

        if(this._equals_ == oldChild)
        {
            setEquals((TEquals) newChild);
            return;
        }

        if(this._expression_ == oldChild)
        {
            setExpression((PExpression) newChild);
            return;
        }

        for(ListIterator<TSemicolon> i = this._semicolon_.listIterator(); i.hasNext();)
        {
            if(i.next() == oldChild)
            {
                if(newChild != null)
                {
                    i.set((TSemicolon) newChild);
                    newChild.parent(this);
                    oldChild.parent(null);
                    return;
                }

                i.remove();
                oldChild.parent(null);
                return;
            }
        }

        throw new RuntimeException("Not a child.");
    }
}
