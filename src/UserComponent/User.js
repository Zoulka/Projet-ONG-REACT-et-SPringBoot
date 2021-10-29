import React from "react";
import UserService from "../Service/UserService";

class User extends React.Component{
    constructor(props) {
        super(props);
        this.state = {
            users:[]
        }
    }
componentDidMount() {
        UserService.getUsers().then((response)=>{
            this.setState({users:response.data})
        });
}
render() {
        return(
            <div>
                <h1 className="text-center">Liste des Adhérants de ARPED</h1>
                <table className="table table-striped">
                    <thead>
                    <tr>
                        <td>Adherant Id</td>
                        <td>Adherant Nom</td>
                        <td>Adherant Prénom</td>
                        <td>Adherant Résidence</td>
                        <td>Adherant Date de naissance</td>
                        <td>Adherant Numero </td>
                        <td>Adherant Email</td>
                    </tr>
                    </thead>
                    <tbody>
                    {
                        this.state.users.map(
                            user =>
                                <tr key={user.id}>
                                <td>{user.id}</td>
                                    <td>{user.nom}</td>
                                    <td>{user.prenom}</td>
                                    <td>{user.residence}</td>
                                    <td>{user.date_naissance}</td>
                                    <td>{user.tel_numero}</td>
                                    <td>{user.email}</td>
                                </tr>
                        )
                    }
                    </tbody>
                </table>
            </div>
        )
}
}

export default User