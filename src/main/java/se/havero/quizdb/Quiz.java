
package se.havero.quizdb;

import java.io.Serializable;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;

/**
 * Represents a quiz
 * @author johan
 */
@Entity
@NamedQueries({
    @NamedQuery(name="find_quiz_by_id", query="select q from Quiz q where q.id = :id "),
    @NamedQuery(name="find_all_quizzes", query="select q from Quiz q"),
    @NamedQuery(name="find_quiz_names", query="select q.name from Quiz q"),
    @NamedQuery(name="find_quiz_by_name", query="select q from Quiz q where q.name = :name")
})
public class Quiz implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(nullable=false, unique=true)
    private String name;
    
    @OneToMany( targetEntity = Question.class)
    private List questionList;
     
    public Quiz(Long id, String name) {
        this.id = id;
        this.name = name;
    }
    
   
    public Quiz() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List getQuestionList() {
        return questionList;
    }

    public void setQuestionList(List questionList) {
        this.questionList = questionList;
    }
    
    

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Quiz)) {
            return false;
        }
        Quiz other = (Quiz) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "se.havero.quizdb.Quiz[ id=" + id +", name=" + name + " ]";
    }
    
}
